package org.openmrs.module.mysqletl.tools;

import java.util.List;
/*
 * Contains Scheduler Credential data
 */
public class SchedulerCredentials {
	
	private static String host, username, password, port;
	
	private static String sshUserName;
	private static String sshPassword;
	private static String sshHost;
	private static String sshPort;
	private static String serverType;
	private static String db_name;
	private static String table_name;
	private static List<String> column_list;
	private static String join_cndtn;
	/*
	 * SchedulerParameters sets schedulers required parameters
	 */
	public static void SchedulerParameters(String SSHUserName, String SSHPassword, String SSHHost, String SSHPort, String ServerType, String DatabaseName, String TableName, List<String> ColumnList, String JoinCndtn){
		host = MySQLClient.gethost();
		port = MySQLClient.getport();
		username = MySQLClient.getuser();
		password = MySQLClient.getpass();
		
		sshHost = SSHHost;
		sshPort = SSHPort;
		sshUserName = SSHUserName;
		sshPassword = SSHPassword;
		
		serverType = ServerType;
		db_name = DatabaseName;
		table_name = TableName;
		column_list = ColumnList;
		join_cndtn = JoinCndtn;
	}
		
	/*
	 * Setter and getter for user
	 */
	public static void setuser(String User) { username = User; }
	public static String getuser() { return username; }

	/*
	 * Setter and getter for password
	 */
	public static void setpass(String Pass) { password = Pass; }
	public static String getpass() { return password; }
	
	/*
	 * Setter and getter for host
	 */
	public static void sethost(String Host) { host = Host; }
	public static String gethost() { return host; }
	
	/*
	 * Setter and getter for port
	 */
	public static void setport(String Port) { port = Port; }
	public static String getport() { return port; }
	
	/*
	 * Setter and getter for sshuser
	 */
	public static void setsshuser(String SSHUser) { sshUserName = SSHUser; }
	public static String getsshuser() { return sshUserName; }

	/*
	 * Setter and getter for sshpassword
	 */
	public static void setsshpass(String SSHPass) { sshPassword = SSHPass; }
	public static String getsshpass() { return sshPassword; }
	
	/*
	 * Setter and getter for host
	 */
	public static void setsshhost(String SSHHost) { sshHost = SSHHost; }
	public static String getsshhost() { return sshHost; }
	
	/*
	 * Setter and getter for port
	 */
	public static void setsshport(String SSHPort) { sshPort = SSHPort; }
	public static String getsshport() { return sshPort; }
	
	/*
	 * Setter and getter for servertype
	 */
	public static void setservertype(String ServerType) { serverType = ServerType; }
	public static String getservertype() { return serverType; }

	/*
	 * Setter and getter for database table
	 */
	public static void setdbname(String DatabaseName) { db_name = DatabaseName; }
	public static String getdbname() { return db_name; }
	
	/*
	 * Setter and getter for database table
	 */
	public static void settablename(String TableName) { table_name = TableName; }
	public static String gettablename() { return table_name; }
	
	
	/*
	 * Setter and getter for host
	 */
	public static void setjoincondition(String JoinCondition) { join_cndtn = JoinCondition; }
	public static String getjoincondition() { return join_cndtn; }
	
	/*
	 * Setter and getter for port
	 */
	public static void setcolumnlist(List<String> ColumnList) { column_list = ColumnList; }
	public static List<String> getcolumnlist() { return column_list; }
	
	public static String toSchedulerInfo(){
		return 	host + ": MySQLClient.gethost()\n"+
		port + ": MySQLClient.getport()\n"+
		username+ ": MySQLClient.getuser()\n"+
		password+ ": MySQLClient.getpass()\n"+
		
		sshHost+ ": SSHHost\n"+
		sshPort+ ": SSHPort\n"+
		sshUserName+ ": SSHUserName\n"+
		sshPassword+ ": SSHPassword\n"+
		
		serverType+ ": ServerType\n"+
		db_name+ ": DatabaseName\n"+
		table_name+ ": TableName\n"+
		column_list.toArray().toString()+ ": ColumnList\n"+
		join_cndtn+ ": JoinCndtn\n";
	}
}
