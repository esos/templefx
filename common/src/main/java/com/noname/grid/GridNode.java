package com.noname.grid;

import com.noname.collections.AbstractGraphVertice;

public class GridNode extends AbstractGraphVertice {
	private static final String stringTemplate = "%s1 coordinates are: x = %2f, y = %3f, z = %4f";
	private float _x, _y, _z = 0.0f;

	public GridNode() {
	}
	
	public GridNode(float x, float y, float z) {
		_x = x;
		_y = y;
		_z = z;
	}
	
	@Override
	public String toString() {
		return String.format(stringTemplate, this, _x, _y, _z);
	}
}