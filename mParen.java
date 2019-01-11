/*
Angelu Ferdinand A. Garcia
CC13-A | Mr. Jun Rangie Obispo
12/9/18
This program evaluates if parentheses are matched.
*/

import java.util.Scanner;
public class mParen
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();

        String[] paren = new String[numCases];
        myStack parenthesesStack = new myStack();

        for(int i = 0; i < numCases; i++)
        {
            paren[i] = input.next();
        }
        System.out.println();

        for(int j = 0; j < numCases; j++)
        {
            j++;
            System.out.print("Case #" +j+ ": ");
            j--;
            isMatched(paren[j], parenthesesStack);

            if(parenthesesStack.isEmpty()==false)
            {
                parenthesesStack.clear();
            }
        }
    }

    public static void isMatched(String paren, myStack parenthesesStack)
    {
        boolean isValid = true;
        for(int k = 0; k<paren.length(); k++)
        {
            if(paren.charAt(k)=='(')//add to stack if opening bracket,
                                    //if closing bracket, pop.
            {
                parenthesesStack.push(k);
            }
            else if(paren.charAt(k)==')')
            {
                parenthesesStack.pop();
            }
            else
            {
                isValid = false;
                break;
            }
        }
        //Only if stack if empty, the parentheses are matched.
        if(isValid == true)
        {
            if(parenthesesStack.isEmpty())
            {
                System.out.println("properly matched");
            }
            else
            {
                System.out.println("not properly matched");
            }
        }
        else
        {
            System.out.println("Error: invalid input");
        }
    }
}
