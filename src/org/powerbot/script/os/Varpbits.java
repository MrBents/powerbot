package org.powerbot.script.os;

import org.powerbot.bot.os.client.Client;

public class Varpbits extends ClientAccessor {
	public Varpbits(final ClientContext ctx) {
		super(ctx);
	}

	public int[] array() {
		final int[] c = new int[0];
		final Client client = ctx.client();
		if (client == null) {
			return c;
		}
		final int[] varpbits = client.getVarpbits();
		return varpbits != null ? varpbits.clone() : c;
	}

	public int varpbit(final int index) {
		final int[] arr = array();
		return index > -1 && index < arr.length ? arr[index] : -1;
	}
}
