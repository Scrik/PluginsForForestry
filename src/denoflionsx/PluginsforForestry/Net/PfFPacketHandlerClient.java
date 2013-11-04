package denoflionsx.PluginsforForestry.Net;

import cpw.mods.fml.common.network.Player;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

public class PfFPacketHandlerClient extends PfFPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
        int id = PfFPacketHandler.PacketMaker.getInternalIdFromPacket(packet);
        for (Packets p : Packets.values()) {
            if (p.getId() == id){
                p.getHandler().onPacketData(manager, packet, player);
            }
        }
    }
}