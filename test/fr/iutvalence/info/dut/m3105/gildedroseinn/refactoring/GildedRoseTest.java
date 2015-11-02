package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void qualityAndSellInDecreaseEachDayTest()
	{
		Item testItem = new Item("testItem",10,20);
		GildedRose.updateItem(testItem);
		assertEquals(testItem.getSellIn(),9);
		assertEquals(testItem.getQuality(),19);
	}

}