package org.cainanyang.dico.kv;

public class TableImpl implements Table {
	
	private TableConfig tableConfig;
	
	public TableImpl(TableConfig tableConfig) {
		this.tableConfig = tableConfig;
		init();
	}
	
	private void init() {
		
	} 

	@Override
	public String get(String k) {
		return null;
	}

	@Override
	public void put(String k, String v) {
		
	}

}
