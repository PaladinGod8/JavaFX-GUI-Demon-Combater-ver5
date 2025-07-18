package guidemon.engine.condition;

import guidemon.engine.scene.SceneContext;
import guidemon.model.actor.Actor;

//checks a passively existing entry without the use of events or activations 

/**
 * Checks a passively existing entry without the use of events or activations. 
 * 
 * Context comes from SceneContext (but sometimes CombatContext is involved during Combat). A Condition can be set for it to only occur in-combat or out-of-combat.
 * 
 * This class separates the interface into a different subtype for a separation of concerns.
 * 
 * Always on unless the condition is broken.  
 */
public interface EligibilityCondition extends Condition {
    //TODO: 
    boolean test(Actor owner, SceneContext context);
}