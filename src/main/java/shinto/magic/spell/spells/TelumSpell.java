package shinto.magic.spell.spells;

import net.minecraft.entity.player.PlayerEntity;
import shinto.magic.chant.statement.Charm;
import shinto.magic.chant.statement.MagicTarget;
import shinto.magic.spell.AbstractSpell;
import shinto.mixin.interfaces.IMixinPlayerEntity;

public class TelumSpell extends AbstractSpell {
    @Override
    public boolean parse(MagicTarget target, Charm charm, Object source) {
        if (source instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) target.getTarget();
            ((IMixinPlayerEntity) player).setExtraDamage(6 * charm.praecantatio);
            return true;
        }
        return false;
    }
}
