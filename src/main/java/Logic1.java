public class Logic1 {

    public boolean old35(int n) {
        boolean isMultipleOf3 = (n % 3 == 0);
        boolean isMultipleOf5 = (n % 5 == 0);
        return (isMultipleOf3 ^ isMultipleOf5);
    }

    public boolean specialEleven(int n) {
        boolean isMultipleOf11 = (n % 11 == 0);
        boolean isNotMultipleOf11 = (n % 11 != 1);
        return (isMultipleOf11 ^ isNotMultipleOf11);
    }

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public boolean less20(int n) {
        return (n % 20 == 19 || n % 20 == 18);
    }

    public boolean nearTen(int num) {
        int remainder = num % 10;
        return (remainder <= 2 || remainder >= 8);
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return (n <= 1 || n >= 10);
        } else {
            return (n >= 1 && n <= 10);
        }
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || (a + b == 6) || (Math.abs(a - b) == 6));
    }

    public boolean lastDigit(int a, int b, int c) {
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB || lastA == lastC || lastB == lastC);
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            return isMom;
        }
        return true;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }
        return 1;
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || a == c || b == c) {
            return 10;
        }
        return 0;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
            return 2;
        }
        if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public boolean sodaParty(int sodas, boolean isWeekend) {
        if (isWeekend) {
            return true;
        }
        return (sodas >= 40 && sodas <= 60);
    }

    public static void main(String[] args) {
        Logic1 logic1 = new Logic1();
        
        // Example usage of some methods
        System.out.println("old35(3): " + logic1.old35(3)); // true
        System.out.println("old35(5): " + logic1.old35(5)); // true
        System.out.println("old35(15): " + logic1.old35(15)); // false

        System.out.println("specialEleven(22): " + logic1.specialEleven(22)); // true
        System.out.println("specialEleven(23): " + logic1.specialEleven(23)); // false

        // Add more tests as needed
    }
}
