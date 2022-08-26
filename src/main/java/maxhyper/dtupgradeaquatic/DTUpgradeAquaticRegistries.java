package maxhyper.dtupgradeaquatic;

import com.ferreusveritas.dynamictrees.api.cells.CellKit;
import maxhyper.dtupgradeaquatic.cells.DTUpgradeAquaticCellKits;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class DTUpgradeAquaticRegistries {

    @SubscribeEvent
    public static void onCellKitRegistry(final com.ferreusveritas.dynamictrees.api.registry.RegistryEvent<CellKit> event) {
        DTUpgradeAquaticCellKits.register(event.getRegistry());
    }

}
