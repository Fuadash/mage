
package mage.cards.v;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.combat.CantAttackControllerAttachedEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.AttachmentType;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author LevelX2
 */
public final class VowOfWildness extends CardImpl {

    public VowOfWildness(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{2}{G}");
        this.subtype.add(SubType.AURA);


        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.Detriment));
        Ability ability = new EnchantAbility(auraTarget);
        this.addAbility(ability);
        
        // Enchanted creature gets +3/+3, has trample, and can't attack you or a planeswalker you control.
        ability = new SimpleStaticAbility(new BoostEnchantedEffect(3,3,Duration.WhileOnBattlefield));
        Effect effect = new GainAbilityAttachedEffect(TrampleAbility.getInstance(), AttachmentType.AURA, Duration.WhileOnBattlefield);
        effect.setText(", has trample");
        ability.addEffect(effect);
        effect = new CantAttackControllerAttachedEffect(AttachmentType.AURA, true);
        effect.setText(", and can't attack you or planeswalkers you control");
        ability.addEffect(effect);
        this.addAbility(ability);
    }

    private VowOfWildness(final VowOfWildness card) {
        super(card);
    }

    @Override
    public VowOfWildness copy() {
        return new VowOfWildness(this);
    }
}
