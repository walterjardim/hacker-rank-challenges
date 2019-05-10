package com.hackerrank.challenge.strings;

import java.util.HashSet;
import java.util.Set;

public class Gemstones {

	public static void main(String[] args) {
		String[] arr = { "xhsbaqwbokcaqbkhrzddydwirmldcr", "kwkbkhlwmlpuomfaenahhnnpgqpkcxlspbomrweoqq",
				"rtdckeukfoppbsiccflxqcoxrhwnxpwyjsrvjngqmbgqfwahhkzcbifrvpamffoxcetdochazcqsqhazndwdk",
				"cakdnrducighyuuemxhqmujauwxabextkdamxybkoyexmdmlyvnmlrwwrt", "czuzxlzrmuaa",
				"gquymxuabmymtnljadbqxjsipnixbyhwhaoaciinwdhppbpyxswcveddpojlopqsuqsvjhpobpdefuj", "abtwcqoib",
				"vqpgcuwvxdlaquaiwydejgpwvpwdjeybgbtienzijzeah",
				"shrcvpgwzdkfcvpmjeuslonwerklxysafwgeurdnshmzunpaxmgfiwsehowfyjboeahpuqlatcmooenlicnrkhcbkl",
				"jcvcatdtubemfmjqfplxgwkqeuyderpznnqhvvpjafnceutugnixltiyrmnptcxpvqadnpowacsuoucwmfgbkzs",
				"ufaqewahvnqsbpqw",
				"jzecprvdbgyxmhslqdxjsqnmdoavvifebqrtklohndgvkemackgmgtpkhqetqybxnpiyvlebovhbwivctrruc",
				"wrhighznjjppsvmsxmtwtnphaxqmyjwtxrrfqxrurbengtrvgmeaxfodwtfucmdeasgzuxkghhjexblancvzd",
				"hluadkczkazvptpjwwempwfpacbnfmhrzghznjln",
				"znizntdoqtqabqvykqvnglbgkmclrzajsqwxnshlzalzfbalkxoxpsmtoon", "paws",
				"nwtsbxdtyqlapasbazttbsguceyqjvebxdjnfdw",
				"kxafenseotsysgeswrtpzibyamlhbjknlcoveihukdebfbwsaqmzvdlaytfilpcqkspdwnysdfjvwdtlsqactcrelzzhxqxzv",
				"yqaaayknxwnbmzkictawsgxeq", "aaqkpvmiiho", "ybnnrikqjybxrawihgyxiegxcimriyqrrgcxsfeidnhwfxjnpzxhloav",
				"pjpdtrolhxvfrftvuweatcisajvqkaqqmblwugegmbpteukwxvoebpemcjquuvlrqkczeabuhmss",
				"epgmbfpdjktvkbiczmumnoirupbasdvxpjhsocxaewcxkquxjolcqwjwnqtnirgsi",
				"hjvkyhlyuqrsoonfqlyxlenoszrlquqsyjwrufuretagpuq", "oaqdya",
				"ikqnbkmmaoxqjmrmxupfaycfwxwzeldjynafrjdkulsvqweciuyukxnmzriseziuqxoxif", "jgabqaqhwashxvki",
				"xrryvkqfkossukeieayukmycfusyrikiotoiutvykatijjjzrioys",
				"uaepqfgaevkewfmyhdmfeifsheilwfusmlnrpjtaeathypaql",
				"pkzqkqvlgadoatqdwhgwkehalzrfawkxlivimioralfsnwqyhampnhqhdgssoo",
				"lyqmibiheakvntaijqiwviwadksmxewhzejpkhdlbisqxmaqcmxctkfvqo",
				"zgylpetfogykwgypzyoxjcuglfcawxubtqnteyvajnafzznmojnhovohsaowhuqpwhlydmtzwvrirjknynsiijivpqguabg",
				"eftqjvctdzhxqbupfkwppcsrujgrziuelxozbzzcrcfbghqzdftctzfxgvmevyvbdbfigsykevjanvlaoepmqedufn",
				"aotiefuigarhpgsghcptscko",
				"pfrqhzapxgeltxikswnocynfguafqsigbpwehbfywndxbxaupzbdggshjocvowitjvunospmtzudcpl",
				"yqzudnoqenlskxakuummlvkefmljvteacihzapaabuvjyjgodptyavvupptmvypvhnta", "solabz",
				"vxlaetxbklmxztfkozbzlolqr", "wvcga",
				"wahauykchejjiyikfwxzsbufdegpovkrbpampyuuhsaqzcnybbjzajjjrbszvbvdpyhbccwsjmnoztlejpffnzfytrdppsjrpvxx",
				"cxkhanwweqhcjttjorgjocdfknajxbtbsucabin", "oya",
				"bznssnvxqvhhsqtmvluzmafqhftmorixkanbsixebrjqucgatepukzivhyhwxzfhgqztqtizkftvthyqjec",
				"bbrjqukyipcnrhirhvcsmzgftpxtvehmfiizhorionzyhqdxodpaazjducjoqowtwzspfs",
				"cnznakegiobpzqlzgyicllqwgrscxedu", "hmofrxma", "adh", "oxa",
				"bglhbygsyapztwrxjedcvpctvilcazozpralyodujolkixitrxwimazwnxmglwvkem",
				"rgiyigzujasnsovsjjaqizcomxakticqyqdpdughlyuazpnfbmcgnveiemsybfdg", "rioajgayihhagpcrj",
				"zqgipdddjqxctpdzqiwzxwvxnwoxstodzcwgergfiiaizebhktlvrizzkomimalfbsxkduavkjxaoairfh",
				"kgjdzysfkxmetkaoylyskcqlqtfzyayyyudxsknzxrcyujmwbnbkbtsfgitrrawfxzjthyfmgckgjqespdifqtpxjbgnvr",
				"hiagaaeynarcvstegt", "yadxdlavbxptwglaiayoowuogvvtgcfywluubqtkzrrhfxlovgef",
				"hlypqfdiqlfnkllzouulioezroipxqdlsxwanwykvbcldhoetaeztgrootpjojcceuacwtzqagqamcvgfdednqczyvbtdx",
				"zisguwmsaxhxuwjmhyfzuwiipggmwdouo",
				"lbwzvwermrlvcmklemjkfrbljlnxrtizbyeikrgwjjptnzumttueabagmxizruareaeykxpblhrxcdyncqvpvcunwnfxzmpgys",
				"prttjtiytlyyrultdkkpltjieolromizxwjfesyslnlxawtuxfiykdjobvoaeehfvxanlqzpkznggwkteeevlvsshvptayxvmttl",
				"qgkpbaajagtvqiyiaodlrsikonhfwakpjdcbtalsxcjvbedvcempmvoeenrignubtaslxftwagdiobnevqzvqva",
				"faedrfxkahlcgoilakrcyivijzutjlrdumyufckvt", "vau",
				"hbvbxfjzegevcqgaphablnsmlbsoeqmaioprbvtddsupvnqngwmxcpflvuafxpvd",
				"brtfnusycjisbcphougpjdvauguelqkzipcuijeoy", "ichepvyzntaev",
				"zenwbsywgmpiutpzcjlaatkzmgobpxbcxmuxarykyoeqdx", "lfluwbfavxkugqlwyxasngjzsdsyjpgeydajtolqsx",
				"bhczkeeqzhzbartmeqpaqruysxjzaauoiqktopalvmdktikkldlrjllmcdpoygeiyukptponoihbsrrfvjfhoce", "zap",
				"ruiospjscgsufpnqkxkyykawjzwkczikahsyzauktafln", "lreuxplanxvcqitroicfi",
				"ohfaufeligmwtcsawktgxwtplivubrwmcjbqwgkcoxjyjwheidyqthgkoakhewhnwkvcatqpbwsqfkiqabjjonykglqwbswfyt",
				"vocqooogtaicbhuaiupuipleufvdccabmfywoykochscytztchknyorlocfdntwwovefaq", "xdmyaggpho",
				"nscoqroxhdadpeuycosccvsnmtuugabmctqjeirzc",
				"jhhlrbgojnrllgdewjvleyqdbfqvnjykfdjlxswwqeacczilgonlysaeqjghqpmwulkpupahsbbwihayahdfljjfgedri",
				"mnfhtdoelgcismveynwpedfgqiosyjadntdewxlufoqorroevrcv",
				"tzcetubjznmepihqloxfevhnyxhoytayxpkjvsgtmpkcimescblehhpgtbrngbwaufvjoqprgipwbahzkhjxfjxruqegcjgwgn",
				"pvcuauizaozvhsbtwgxihosfgjazpahwkai",
				"zsgkakcjezqvrqokvtgvecfgykwmvdpnapvjsuglckolshfiawxkogumzwiverjxpoyyuyhmopglvvfyuwa",
				"rfywidpltzdddyrhorkbfanakjjbfyhs",
				"liwgcigsdsyglkbefvbraoaexrprytclpvbwwpppouxbcmhpzswfkuhbkbzhymrceewbsdjsugwznmouri",
				"epaotrdpredwowbjpafkswggzhhzigjcrkvlpbqgucvaprkskwilfmgzyqiijibzvteiujzjqeankernianranftzkoafyzrj",
				"ntvvsjszkygncqfabnbajpmibfykwgyfaloozaoohtvnxclgsxjnlyvhvg",
				"bpsbesgxuufgaxsmcyhbfgfmzcyaxwizbmoyecacp", "mjootlmwwumapdrjmbhayptf", "kbrna",
				"xgooaibxlpjfotxwfgjtomwpjhmvjliubjavgjizaudpta",
				"cclrtzxwjsybpazszlbhwewuqbathpvrstemsdfqxblzlgblgkdrvpwitgqykmduvyapqw",
				"jsnpkdnmgpxgayihlblrxdpwqrctzvzoaylituwbiojtfuhfkpaggsbmqjaddmfjhaqpscyxpznwhlbxnp",
				"afclnupiwlgqchkdahacm",
				"ghibvbwuorvaubjkwphqghpzzqhgqhagzgsrtoouxefpckwvcndwlxjnpzzliqeeduqlezlayvdvzfstzpyomdyx", "cabazene",
				"iccteslmzahdvafdufaiactlgghsqqsayzalvyvfznwwiwgdshqrzgukgdqswm", "va",
				"evcmyciioxyggjpyeojrptzrfijszfargbtqjwyyseijzehgzlwhrresgbnpmzmasx",
				"gadtslngjkipbhdzfeypofxqdycmornqzwjucxsslvjhrmewcljekmeqtjaimjmxasyfbpjhkvgugmwkjyylygswjehflhwxv",
				"dpcazx", "mqakmgqxwqmj",
				"ombmwzjgntuvvhulglygpoqswngfedmdlywxqwjrpcyokultptfzmxpbflshggoycfaanaezburiqsphbzeqzbhkfykaemgsgu" };
		System.out.println(gemstones(arr));
	}

	static int gemstones(String[] arr) {
		int result = 0;

		if (arr.length > 0) {
			String first = arr[0];
			char[] chars = first.toCharArray();
			Set<Character> charSet = new HashSet<>();
			for (char c : chars) {
				charSet.add(c);
			}

			if (arr.length == 1) {
				result = charSet.size();
			} else {
				for (char c : charSet) {
					boolean foundAll = true;

					for (int j = 1; j < arr.length; j++) {
						if (!arr[j].contains(String.valueOf(c))) {
							foundAll = false;
							break;
						}
					}

					if (foundAll) {
						result++;
					}

				}
			}
		}

		return result;

	}

}
