package listener;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class ItemDamageListener implements Listener {


    @EventHandler
    public void onDamage (EntityDamageEvent e){

        if(e.getEntity() instanceof Item){



                if(e.getCause()== EntityDamageEvent.DamageCause.ENTITY_EXPLOSION|| e.getCause()== EntityDamageEvent.DamageCause.BLOCK_EXPLOSION){

                    e.setCancelled(true);





            }



        }

    }


}
