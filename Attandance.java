package com.bridgelabz.in;
public class Attandance
    {

        public static void main(String[] args)
        {

            int isFullTime=1;
            double Empcheck= Math.floor(Math.random() *10)%2;

            if(Empcheck==isFullTime)
            {
                System.out.println("Employee is Present");

            }
            else
            {
                System.out.println("Employee is Absent");
            }

        }

    }
