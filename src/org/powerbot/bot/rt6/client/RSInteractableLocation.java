package org.powerbot.bot.rt6.client;

import org.powerbot.bot.ContextAccessor;
import org.powerbot.bot.Reflector;

public class RSInteractableLocation extends ContextAccessor {
	public RSInteractableLocation(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public float getX(){
		return engine.accessFloat(this);
	}

	public float getY(){
		return engine.accessFloat(this);
	}

	public float getZ(){
		return engine.accessFloat(this);
	}
}
