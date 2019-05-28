package net.minidev.json.reader;

import net.minidev.json.JSONStyle;

import java.io.IOException;

public interface JsonWriterI<T> {
	public <E extends T> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException;
}
