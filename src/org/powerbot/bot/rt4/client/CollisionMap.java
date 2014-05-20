package org.powerbot.bot.rt4.client;

import org.powerbot.bot.ContextAccessor;
import org.powerbot.bot.Reflector;

public class CollisionMap extends ContextAccessor {
	public CollisionMap(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public int[][] getFlags() {
		return engine.access(this, int[][].class);
	}

	public int getOffsetX() {
		return engine.accessInt(this);
	}

	public int getOffsetY() {
		return engine.accessInt(this);
	}
}
