package com.ardublock.translator.block.ADC;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class readDiscrete extends TranslatorBlock {

	public readDiscrete (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{
			String slot;
			
			TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
			slot = translatorBlock.toCode();
			
			return codePrefix + "P1.readDiscrete(" + slot + ", 0)" + codeSuffix ;	
		}
}
