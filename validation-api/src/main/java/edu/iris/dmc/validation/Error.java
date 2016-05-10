package edu.iris.dmc.validation;

import java.util.Date;

public class Error {

	private int id;
	private String network;
	private Date nStart;
	private Date nEnd;
	private String station;
	private Date sStart;
	private Date sEnd;
	private String location;
	private String channel;
	private Date cStart;
	private Date cEnd;
	private String path;
	private Object invalidValue;
	private String message;

	public Error() {
	}

	public Error(String network, Date nStart, Date nEnd, String station, Date sStart, Date sEnd, String location,
			String channel, Date cStart, Date cEnd, String path, Object invalidValue, String message) {
		super();
		this.network = network;
		this.nStart = nStart;
		this.nEnd = nEnd;
		this.station = station;
		this.sStart = sStart;
		this.sEnd = sEnd;
		this.location = location;
		this.channel = channel;
		this.cStart = cStart;
		this.cEnd = cEnd;
		this.path = path;
		this.invalidValue = invalidValue;

		if (message != null) {
			message = message.trim();
			if (!message.isEmpty()) {
				String array[] = message.split(",");
				if (array.length > 1) {
					this.id = Integer.valueOf(array[0]);
					this.message = array[1];
				} else {
					this.message = array[0];
				}
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public Date getnStart() {
		return nStart;
	}

	public void setnStart(Date nStart) {
		this.nStart = nStart;
	}

	public Date getnEnd() {
		return nEnd;
	}

	public void setnEnd(Date nEnd) {
		this.nEnd = nEnd;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Date getsStart() {
		return sStart;
	}

	public void setsStart(Date sStart) {
		this.sStart = sStart;
	}

	public Date getsEnd() {
		return sEnd;
	}

	public void setsEnd(Date sEnd) {
		this.sEnd = sEnd;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getcStart() {
		return cStart;
	}

	public void setcStart(Date cStart) {
		this.cStart = cStart;
	}

	public Date getcEnd() {
		return cEnd;
	}

	public void setcEnd(Date cEnd) {
		this.cEnd = cEnd;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Object getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(Object invalidValue) {
		this.invalidValue = invalidValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
