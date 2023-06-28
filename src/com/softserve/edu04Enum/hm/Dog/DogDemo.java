package com.softserve.edu04Enum.hm.Dog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// READY !!
public class DogDemo implements interfaceRunMyApp{
    public void runMyApp() throws IOException {
        сheckMatchesNames(new Dog[]{createDog(), createDog(), createDog()});
    };
    public void сheckMatchesNames(Dog[] dogs) {
        int maxAge = dogs[0].getAge();
        int iMaxAge = 0;
        boolean b = false;
        for (int k = 0; k < dogs.length; k++) {
            if (maxAge < dogs[k].getAge()) {
                maxAge = dogs[k].getAge();
                iMaxAge = k;
            }
            for (int i = 0; i < dogs.length - 1; i++) {
                for (int j = 1; j < dogs.length; j++) {
                    if (dogs[i].getName().equals(dogs[j].getName()) && !dogs[i].equals(dogs[j])) {
                        b = true;
                    }
                }
            }
        }
        if (b == true) {
            System.out.println("We found a match for the names");
        }
        System.out.println("The oldest dog's name is " + dogs[iMaxAge].getName() + " and it breed is " + dogs[iMaxAge].getBreed());
    }
        public static String returnInputData (String s) throws IOException{
            System.out.println(s);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String result = "";
            try {
                result = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("You input wrong data");
            }
            return result;
        }

        public static Dog createDog () throws IOException {
            String name = returnInputData("Input name of dog");
            Breed breed = Breed.valueOf(returnInputData("Input breed of dog"));
            int age = Integer.parseInt(returnInputData("Input age of dog"));
            Dog dog = new Dog(name, breed, age);
            return dog;
        }
    public static void main(String[] args) throws IOException {
        interfaceRunMyApp dog = new DogDemo();
        dog.runMyApp();
    }
}


