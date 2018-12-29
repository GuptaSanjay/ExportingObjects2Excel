package UserBeans;

public class DeviceDetails {
	
	private int id;
	private String modelNumber;
	private String deviceType;
	private String assigneeName;
	private String androidVersion;
	
	public DeviceDetails() {
		
	}
	
	public DeviceDetails(int id, String modelNumber, String deviceType, String assigneeName, String androidVersion) {
		super();
		this.id = id;
		this.modelNumber = modelNumber;
		this.deviceType = deviceType;
		this.assigneeName = assigneeName;
		this.androidVersion = androidVersion;
	}


	public int getId() {
		return id;
	}


	public String getModelNumber() {
		return modelNumber;
	}


	public String getDeviceType() {
		return deviceType;
	}


	public String getAssigneeName() {
		return assigneeName;
	}


	public String getAndroidVersion() {
		return androidVersion;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}


	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}


	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}


	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	
}
