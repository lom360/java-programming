package com.codegym.task.task12.task1223;

/* 
Fluffy yet again…
Add one method to the Cat class so that the program doesn't display anything.

Requirements:
1. The Solution class must have a Pet class.
2. The Solution class must have a Cat class.
3. The Cat class must inherit the Pet class.
4. The Pet class must have only two methods called getName() and setName().
5. Add one method to the Cat class so that the program doesn't display anything.
6. The program must display the result of calling the getName() method on pet.
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("I'm Fluffy");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            this.name = "";
        }
    }
}
