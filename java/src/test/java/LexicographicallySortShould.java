package java;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class LexicographicallySortShould {

	LexicographicallySorter lexicographicallySorter = new LexicographicallySorter();

	@Test
	public void sortSimpleSample() {
		String input =
				"5\n" +
				"6 facebook hacker cup for studious students\n" +
				"5 k duz q rc lvraw\n" +
				"5 mybea zdr yubx xe dyroiy\n" +
				"5 jibw ji jp bw jibw\n" +
				"5 uiuy hopji li j dcyi";

		String expected =
				"cupfacebookforhackerstudentsstudious\n" +
				"duzklvrawqrc\n" +
				"dyroiymybeaxeyubxzdr\n" +
				"bwjibwjibwjijp\n" +
				"dcyihopjijliuiuy";

		assertThat(lexicographicallySorter.sort(input), is(expected));
	}

	@Test
	public void sortComplexSample() {
		String input =
				"20\n" +
				"9 rgh woqg dmabatgbt qrvpcrx eluunoi sy w wnthqxgkg aimallazuc\n" +
				"9 jg j uj ujnzdng nzdng nzdn e g ujnzdngj\n" +
				"5 jibw ji jp bw jibw\n" +
				"9 nl jtdmdxu ux nlmnyzdxu mnyz jtdm nlmnyz dxu uxdxu\n" +
				"9 dcn csmzj krnc vkcoume wvpva yqoexwujwp v cxepgptf xb\n" +
				"9 ksdzsjz bbio ja mvvyxzkmq zgdvxolmt xgvwdbfqzn rhubnqtaad qa eeb\n" +
				"9 iccrmcrm mwp sil iccrmcrm ic odo iccrm crm odocrm\n" +
				"9 o zt da wv brorejctww fu phnej ynrdkylwys ekggrmehcl\n" +
				"9 hdfeax d s uxnnrzko nxpcu v njxqbnh aaqzeeb kxpkw\n" +
				"9 vkzzfgtobz i tkczlqaf peqmnyoh eogzpbe bgorlllxor bkkupvnqr gsr xfqmteh\n" +
				"9 wjxwgm qdhmzkmpzv uhibo gcikegpzv ceqiwekdx rxegvkc ujjvbv kfit peiawyk\n" +
				"9 eavcqvv wyuh mkfq not evhlpur eidqnartht pesgphnnlq t ztvu\n" +
				"9 z dvqgfh wqx vnajabkqvs sdwkc dlhcnc ezrcvsc teje gzwwj\n" +
				"9 i hsmh hsmheh xgi eh xg xgeh xnfc ihsmh\n" +
				"9 izqht h qpbdayaifl pjsoie sujccnm umj dralemrspo euswuti m\n" +
				"9 r wwwr ndtc ndtclp lpb b wwwb www lp\n" +
				"9 c evaxdeyrxb rhhfmdm xq vxedern diqs tpdofbc rbq kbxdy\n" +
				"9 k itqsgpwze ma yhpncg xtf w m kahula zgbo\n" +
				"9 fujv mzr kgukjmokvz schpxugnef p rjojpzbsro wpobp wl od\n" +
				"9 u ufmu ufmuqfy vmc ufm uqfy z vmcu qfy";

		String expected =
				"aimallazucdmabatgbteluunoiqrvpcrxrghsywnthqxgkgwoqgw\n" +
				"egjgjnzdngnzdnujnzdngjujnzdnguj\n" +
				"bwjibwjibwjijp\n" +
				"dxujtdmdxujtdmmnyznlmnyzdxunlmnyznluxdxuux\n" +
				"csmzjcxepgptfdcnkrncvkcoumevwvpvaxbyqoexwujwp\n" +
				"bbioeebjaksdzsjzmvvyxzkmqqarhubnqtaadxgvwdbfqznzgdvxolmt\n" +
				"crmiccrmcrmiccrmcrmiccrmicmwpodocrmodosil\n" +
				"brorejctwwdaekggrmehclfuophnejwvynrdkylwyszt\n" +
				"aaqzeebdhdfeaxkxpkwnjxqbnhnxpcusuxnnrzkov\n" +
				"bgorlllxorbkkupvnqreogzpbegsripeqmnyohtkczlqafvkzzfgtobzxfqmteh\n" +
				"ceqiwekdxgcikegpzvkfitpeiawykqdhmzkmpzvrxegvkcuhiboujjvbvwjxwgm\n" +
				"eavcqvveidqnarthtevhlpurmkfqnotpesgphnnlqtwyuhztvu\n" +
				"dlhcncdvqgfhezrcvscgzwwjsdwkctejevnajabkqvswqxz\n" +
				"ehhsmhehhsmhihsmhixgehxgixgxnfc\n" +
				"dralemrspoeuswutihizqhtmpjsoieqpbdayaiflsujccnmumj\n" +
				"blpblpndtclpndtcrwwwbwwwrwww\n" +
				"cdiqsevaxdeyrxbkbxdyrbqrhhfmdmtpdofbcvxedernxq\n" +
				"itqsgpwzekahulakmamwxtfyhpncgzgbo\n" +
				"fujvkgukjmokvzmzrodprjojpzbsroschpxugnefwlwpobp\n" +
				"qfyufmufmuqfyufmuuqfyuvmcuvmcz";

		assertThat(lexicographicallySorter.sort(input), is(expected));
	}
}
