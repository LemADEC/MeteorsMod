package net.meteor.common.item;

import net.meteor.common.LangLocalization;
import net.meteor.common.MeteorsMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMetArmor extends ItemArmor
{
	
	private String armorTex;
	
	public ItemMetArmor(ItemArmor.ArmorMaterial armorMaterial, int j, int k)
	{
		super(armorMaterial, j, k);
		this.setCreativeTab(MeteorsMod.meteorTab);
	}
	
	public ItemMetArmor setArmorTexture(String tex) {
		this.armorTex = tex;
		return this;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (slot == 2) {
			return "meteors:textures/armor/" + this.armorTex + "Armor_2.png";
		} else {
			return "meteors:textures/armor/" + this.armorTex + "Armor_1.png";
		}
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack)
	{
		return LangLocalization.get(this.getUnlocalizedName(par1ItemStack) + ".name").trim();
	}
	
	@Override
	public Item setTextureName(String s) {
		return super.setTextureName(MeteorsMod.MOD_ID + ":" + s);
	}
	
}