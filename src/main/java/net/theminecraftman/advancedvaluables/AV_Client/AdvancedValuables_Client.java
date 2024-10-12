package net.theminecraftman.advancedvaluables.AV_Client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;

public class AdvancedValuables_Client implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.RED_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.FUSION_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.RUBY_DOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.FUSION_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedValuables_BlockClass.RUBY_TRAPDOOR, RenderLayer.getCutout());
    }
}
