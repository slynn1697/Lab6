/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Month {
    
    int[] monthNumberArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int monthNumber;
    String monthName;
    String[] monthNameArray = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Month() {
        this.monthNumber = 1;
    }

    public Month(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            this.monthNumber = 1;
        }
    }

    public Month(String monthName) {
        for (int i = 0; i < 12; i++) {
            if (monthName.equalsIgnoreCase(this.monthNameArray[i])) {
                this.monthNumber = i + 1;
                this.monthName = monthName;
            } else {
                this.monthNumber = 1;
                this.monthName = monthNameArray[0];
            }
        }
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            this.monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    @Override
    public String toString() {
        return this.monthName;
    }

    public boolean equals(Month month) {
        return (this == month);
    }

    public boolean greaterThan(Month month) {
        if (this.monthNumber > month.monthNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThan(Month month) {
        if (this.monthNumber < month.monthNumber) {
            return true;
        } else {
            return false;
        }
    }
}
