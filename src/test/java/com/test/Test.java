package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试用例
 *
 * @author Doug Liu
 * @since 2022-06-10
 *
 */
public class Test {

	// 定义一个正则表达式，用于匹配@符号后面的内容
	static Pattern referer_pattern = Pattern.compile("@([^@^\\s^:]{1,})([\\s\\:\\,\\;]{0,1})");//@.+?[\\s:]

	// 定义一个常量，用于匹配@符号后面的内容
	private static final Pattern REFERER_PATTERN = Pattern.compile("@([^@^\\s:]+)([\\s:,;]?)");

	public static void main(String[] args) {
		// 定义一个字符串，用于测试
		String msg = "@测试信息 测试@测试测试 ";
		// 使用正则表达式匹配字符串
		Matcher matchr = REFERER_PATTERN.matcher(msg);
		// 循环匹配到的内容
		while (matchr.find()) {
			// 获取匹配到的字符串
			String origion_str = matchr.group();
			// 输出匹配到的字符串
			System.out.println("解析到的---->" + origion_str);
			// 将匹配到的字符串替换为特定格式的字符串
			msg = msg.replaceAll(origion_str, "!@#{id:1}!@# ");
			// 获取替换后的字符串
			String str = origion_str.substring(1, origion_str.length()).trim();
			// 获取替换后的字符串的最后一个字符
			char ch = str.charAt(str.length() - 1);
			// 如果最后一个字符是:、,、;，则去掉最后一个字符
			if (ch == ':' || ch == ',' || ch == ';')
				str = str.substring(0, str.length() - 1);
			// 输出替换后的字符串
			System.out.println("用户名---->" + str);

			// 输出替换后的字符串
			System.out.println("替换后的---->" + msg);
		}
		// 输出最终的字符串
		System.out.println(msg);
	}
}