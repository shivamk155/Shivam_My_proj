class TaskEvenOdd implements Runnable {
		private int max;
	    private Printer print;
	    private boolean isEvenNumber;

	    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
	        this.print = print;
	        this.max = max;
	        this.isEvenNumber = isEvenNumber;
	    }

	    @Override
	    public void run() {

	        int number = ((isEvenNumber == true) ? 2 : 1);
	        while (number <= max) {

	            if (isEvenNumber) {
	                System.out.println("Even :"+ Thread.currentThread().getName());
	                print.printEven(number);
	            } else {
	                System.out.println("Odd :"+ Thread.currentThread().getName());
	                print.printOdd(number);
	            }
	            number += 2;
	        }

	    }

	}

