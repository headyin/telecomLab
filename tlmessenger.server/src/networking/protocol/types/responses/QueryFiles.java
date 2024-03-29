package networking.protocol.types.responses;

public enum QueryFiles {
	NO_FILES(0),
	FILES(1),
	NOT_LOGGED_IN(2);
	
	private int i;
	private QueryFiles(int i) {
		this.i = i;
	}
	
	public int getInt() {return i;}
	public static QueryFiles ofInt(int i) {
		for (QueryFiles qm : QueryFiles.values())
			if (qm.i == i)
				return qm;
		return NO_FILES;
	}

}
