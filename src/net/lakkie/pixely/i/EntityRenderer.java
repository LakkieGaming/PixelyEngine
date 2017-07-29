package net.lakkie.pixely.i;

import net.lakkie.pixely.context.PixelyContext;
import net.lakkie.pixely.entity.Entity;

public interface EntityRenderer {

	void render(PixelyContext ctx, Entity entity);
	
}
