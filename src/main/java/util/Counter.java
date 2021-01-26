package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;

	// method increments _ctr
	public void increment() {
		_ctr++;
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--;
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0;
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		do {
			_ctr++;
		} while (_ctr % 2 != 0);
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		do {
			_ctr--;
		} while (_ctr % 2 != 0);
	}

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		do {
			_ctr++;
		} while (isPrimeNumber(_ctr) );
	}

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		do {
			_ctr--;
		} while (isPrimeNumber(_ctr));
	}

	// TODO: dev3- count the frequency of word in sentence
	public void countFrequency(String word, String sentence) {
		reset();
		StringTokenizer st = new StringTokenizer(sentence);
		while(st.hasMoreTokens()) {
			if(word.equals(st.nextToken())) {
				_ctr++;
			}
		}
	}

	private boolean isPrimeNumber(int num) {
		int i =2;
		while (i <= num / 2) {
			if (num % i == 0) {
				return true;
			}

			i++;
		}
		return false;

	}

}
