package com.bl;

public class InnoiceSummary {

	private int numberOfRides;
	private double totalFare;
	private double averageFare;

	public InnoiceSummary(int numberOfRides, double totaleFare) {
		this.numberOfRides = numberOfRides;
		this.totalFare = totaleFare;
		this.averageFare = this.totalFare / this.numberOfRides;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InnoiceSummary other = (InnoiceSummary) obj;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (numberOfRides != other.numberOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}

}
