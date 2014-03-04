package org.cainanyang.dico.kv;

public interface Table {
	String get(String k);
	void put(String k, String v);
}
