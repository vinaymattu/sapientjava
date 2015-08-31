package com.workspace.cui.Client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class data {
	int value;

	public data(int value) {
		this.value = value;
	}

	public void getValue() {
		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int hashCode() {

		return (Integer) this.value;

	}

	public boolean equals(Object obj) {

		if (this.value == ((data) obj).getValue()) {
			return true;

		} else {
			return false;
		}
	}

}

public class CollectionExample {

	public static void main(String[] args) {

		Set<data> result = new HashSet<data>();

		result.add(new data(4));
		result.add(new data(3));
		result.add(new data(2));
		result.add(new data(4));
		result.add(new data(6));

		Iterator<data> iterator = result.iterator();
		data name;

		while (iterator.hasNext()) {
			name = iterator.next();
			System.out.println(name);
		}
	}

}
