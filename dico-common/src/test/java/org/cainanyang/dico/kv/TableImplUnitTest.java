package org.cainanyang.dico.kv;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TableImplUnitTest {
	
	private Table table;
	
	@Before
	public void setUp() {
		TableConfig config = new TableConfig();
		config.name = "name_1";
		config.basedir = "/tmp/dico-table";
		table = new TableImpl(config);
	}
	
	@Test
	public void testGet() {
		Assert.assertNull(table.get("k"));
	}
}
