/**
 * Author: Edward Chan
 * 
 * 
 */

public class IPAddress{
	String srcIP;
	String time;
	public IPAddress(String t, String ip){
		time = t;
		srcIP = ip;
	}

	public String getHour() {
		String hour;
		hour = time.substring(6,8);
		return hour;
	}
}