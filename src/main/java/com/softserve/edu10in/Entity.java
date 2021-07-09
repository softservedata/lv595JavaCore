package com.softserve.edu10in;

class Entity {
	
	private static class Counter {
		private void setCount() {
			count = count + 1;
		}
	}
	
	//---------------------------------------------
	
	private static int count = 0;
	private static Counter counter;

	static {
		counter = new Counter();
	}

	public Entity() {
		// new Counter().setCount();
		counter.setCount();
	}

	public static int getCount() {
		return count;
	}

}
