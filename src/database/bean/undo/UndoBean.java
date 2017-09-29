package database.bean.undo;

public class UndoBean {
	
	private String Schema;
	private String Table;
	private String Command;
	private String[] Parameter;

	public String getSchema() {
		return Schema;
	}

	public void setSchema(String schema) {
		Schema = schema;
	}

	public String getTable() {
		return Table;
	}

	public void setTable(String table) {
		Table = table;
	}

	public String getCommand() {
		return Command;
	}

	public void setCommand(String command) {
		Command = command;
	}

	public String[] getParameter() {
		return Parameter;
	}

	public void setParameter(String[] parameter) {
		Parameter = parameter;
	}

	@Override
	public String toString(){
		String s = Command+":"+Schema+"."+Table+" {"+Parameter+"}";
		return s;
		
	}
}
