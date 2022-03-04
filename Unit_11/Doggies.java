//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
    private Dog[] pups;

    public Doggies(int size)
    {
        pups = new Dog [size];
        
    }
    
    public void set(int spot, int age, String name)
    {  
        pups[spot] = new Dog (age, name);
    }

    public String getNameOfOldest()
    {
        int oldest = 0;
        int oldestIndex = 0;
        
        for (int i = 1; i < pups.length; i++) {
            if (pups[i].getAge() > oldest) {
                oldest = pups[i].getAge();
                oldestIndex = i;
            }
        }
        return pups[oldestIndex].getName();
    }

    public String getNameOfYoungest()
    {
        int youngest = 0;
        int youngestIndex = 0;
        
        for (int i = 0; i < pups.length - 1; i++) {
            if (pups[i].getAge() < youngest) {
                youngest = pups[i].getAge();
                youngestIndex = i;
            }
        }
        return pups[youngestIndex].getName();
    }

    public String toString()
    {
        return ""+Arrays.toString(pups);
    }
}