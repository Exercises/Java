package net.juude.java.math;

public class Angle {
	
	public static void main(String[] args) {
		float[] startPoint = new float[]{-1, -1};
		float[] endPoint = new float[] {-2, -2};
		System.out.println(" angle" + getAngle(startPoint, endPoint));
		
		float[] startPoint2 = new float[]{0, 0};
		float[] endPoint2 = new float[] {0.8660254037844386f, 0.5f};
		System.out.println(" angle2 : " + getAngle(startPoint2, endPoint2));
		
		
		System.out.println(" differnece of 1 and 359 is : " + getAngleDifference(1, 359));
		System.out.println(" differnece of 359 and 1 is : " + getAngleDifference(359, 1));
		System.out.println(" differnece of 30 and 180 is : " + getAngleDifference(30, 180));

	}
	
	//get angle of the line
	public static double getAngle(float[] startAngle, float[] endAngle) {
		float distance = (float) Math.sqrt((endAngle[0] - startAngle[0]) * (endAngle[0] - startAngle[0]) + (endAngle[1] - startAngle[1]) * (endAngle[1] - startAngle[1]));
		if(distance == 0) {
			return 0;
		}
		float sinx = (endAngle[1] - startAngle[1])/distance;
		float cosx =  (endAngle[0] - startAngle[0])/distance;
		return Math.atan2(sinx, cosx)/Math.PI*180;
	}
	
	public static float getAngleDifference(float firstAngle, float secondAngle) {
		float difference = secondAngle - firstAngle;
		if(difference > 180) {
			difference -= 360;
		}else if(difference < -180) {
			difference += 360;
		}
		return difference;
	}
}
