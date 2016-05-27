package core.iface;

public interface INetworkData {

	public void read(String data);

	public String getLabel();

	// components

	public String[] getServerLabels();

	public String[] getDeviceLabels();

	public String[] getDeviceMacs();

	public String[] getServerProfiles(String server);

	public String getServerData(String server, String label);

	public String getServerUser(String server);

	public String getServerIP(String server);

	public String getServerPort(String server);

	public String getServerUpdate(String server);
}
