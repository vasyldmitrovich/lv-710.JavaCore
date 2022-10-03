package com.softserve.numberToWord.Utils;

import java.awt.*;
import java.awt.datatransfer.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.softserve.numberToWord.Utils.NumberToWord.numberToWordsUkr;

public class JlipBoard extends Thread implements ClipboardOwner {
    Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
    boolean bEnough = false;

    @Override
    public void run() {
        Transferable trans = sysClip.getContents(this);
        regainOwnership(trans);
        System.out.println("Listening to board...");
        while (true) {
            if (isitEnough()) break;
        }
        ///System.out.println("No more Listening...");
    }

    public void itisNotEnough() {
        bEnough = false;
    }

    boolean isitEnough() {
        return bEnough;
    }

    public void lostOwnership(Clipboard c, Transferable t) {
        try {
            sleep(200);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        try {
            Transferable contents = c.getContents(this); //EXCEPTION
            //processContents(contents);
            regainOwnership(contents);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void processContents(Transferable t) {
        if (isitEnough()) return;
        DataFlavor[] flavors = t.getTransferDataFlavors();
        double price;
        int quantity;
        int pdv;
        String buffer;
        String result;
        for (int i = flavors.length - 1; i >= 0; i--) {
            try {
                Object o = t.getTransferData(flavors[i]);
                if (o instanceof String) {
                    System.out.println((String) o);
                    buffer = (String) o;

                    System.out.println(buffer.trim());
                    Pattern p = Pattern.compile("(\\d+\\.\\d\\d) (\\d+) (\\d+)");
                    Matcher m = p.matcher(buffer.trim());
                    if (m.find()) {
                        price = Double.parseDouble(m.group(1));
                        quantity = Integer.parseInt(m.group(2));
                        pdv = Integer.parseInt(m.group(3));
                        double sumPdv = price*quantity*pdv/100;
                        double summa =price*quantity+sumPdv;
                        String sum = String.format("%.2f",summa);
                        result = String.format("%.2f",sumPdv);
                        result=numberToWordsUkr(Integer.parseInt(sum.substring(0,sum.length()-3)))+
                        " грн. "+sum.substring(sum.length()-2)+" коп., у т.ч. ПДВ("+
                        pdv+"%) "+result+" грн.";
                        System.out.println(result);
                        StringSelection stringSelection = new StringSelection(result);
                        sysClip.setContents(stringSelection,stringSelection);
                    }
                    break;
                }
            } catch (Exception exp) {
                exp.printStackTrace();
            }
        }
        ///System.out.println("Processing: ");
    }

    void regainOwnership(Transferable t) {
        sysClip.setContents(t, this);
        processContents(t);
    }

    public static void main(String[] args) {
        JlipBoard b = new JlipBoard();
        b.itisNotEnough();
        b.start();
    }
}