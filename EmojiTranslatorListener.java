// Generated from EmojiTranslator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmojiTranslatorParser}.
 */
public interface EmojiTranslatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmojiTranslatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EmojiTranslatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiTranslatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EmojiTranslatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiTranslatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(EmojiTranslatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiTranslatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(EmojiTranslatorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiTranslatorParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(EmojiTranslatorParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiTranslatorParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(EmojiTranslatorParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiTranslatorParser#emojiSeq}.
	 * @param ctx the parse tree
	 */
	void enterEmojiSeq(EmojiTranslatorParser.EmojiSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiTranslatorParser#emojiSeq}.
	 * @param ctx the parse tree
	 */
	void exitEmojiSeq(EmojiTranslatorParser.EmojiSeqContext ctx);
}