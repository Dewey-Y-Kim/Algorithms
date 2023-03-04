package MyStudy;


import java.time.LocalDate;
import java.util.Scanner;

public class RanData {

	public RanData() {
		// TODO Auto-generated constructor stub
	}
	String[] pname= {"가람", "개울", "고개", "고갯길", "고을", "골짜기", "곶", "기슭", "깃", "나루", "나리", "나릿물", "들", "도랑", "두메", "둔덕", "들", "뜰", "마루", "뫼", "멧골", "묏기슭", "묏길", "물가", "물갈래", "물곬", "물구렁", "물굽이", "물돌", "새암", "샘", "샘밑", "서울", "섟", "수풀", "시골", "시내", "시냇가", "시냇물", "시냇발", "어귀", "여울", "여울목", "오름", "우물", "움", "서", "서레 "};
	String[] hname = {"안채연", "임윤아", "임나연", "임나영", "정채연", "정윤혜", "조하슬", "주민희", "지수연", "최예원", "하수영", "한해빈","가인", "간미연", "강민경", "강민희", "강성미", "강세정", "강수빈", "강애리자", "강주희", "거미", "검지", "경리", "계피", "고가은", "고나영", "고은미", "고은채", "공민지", "공서영", "공승연", "권나라", "권리세", "권소현", "금잔디", "기희현", "길건", "길은정", "길학미", "김가영", "김남주",
			"김다나", "김다솜", "김립", "김미려", "김보아", "김보형", "김사은", "김소리", "김소유", "김송", "김수희", "김승미", "김승혜", "김양", "김연자", "김연지", "김예원", "김완선", "김우린", "김윤아", "김윤주", "김율희", "김은정", "김의영", "김재경", "김정민", "김정은", "김정은", "김주나", "김주일", "김준희", "김지숙", "김지애", "김채원", "김채원", "김태연", "김하나", "김현지", "김혜림", "나나", "나르샤", "나비", "나슬기", 
			"나연", "나오미", "나해령", "나현", "낸시", "노을", "노현희", "다나", "다영", "다원", "달수빈", "두리", "레나", "레이나", "레이디", "렉시", "로제", "루나", "루다", "류세라", "류수정", "리아", "리코", "린지", "마망", "마야", "메이비", "문별", "미나", "미나", "미연", "민", "민니", "민서", "민아", "민해경", "바다", "박경림", "박규리", "박기량", "박기영", "박미경", "박미경", "박보람", "박봄", "박산다라", "박성연", "박수아", "박수진", "박시은", "박윤경", "박정아", "박지윤", "박칼린", "박탐희", "박혜경", "박혜수", "박화요비", "박희본", "반소영", "방실이", "배다해", "배소연", "배슬기", "배연정", "백다은", "백보람", "백설희", "백수정", "백아연", "백지영", "베이지", "벤", "별", "보나", "보아", "비니", "사오리", "사현진", "샤넌", "서문탁", "서연", "서예안", "서주경", "서지수", "서지영", "서현", "서현진", "선미", "선민", "선샤인", "선예", "선우", "선우정아", "설리", "설아", "설주영", "설하수", "설하윤", "설현", "성연", "성유리", "성은채", "소야", "소연", "소연", "소유미", "소율", "소이", "소향", "소희", "손나은", "손담비", "손승연", "손지현", "솔라", "솔비", "솔빈", "솔지", "송가인", "송상은", "송은이", "송재윤", "송주희", "송지은", "송하영", "송하예", "수란", "수민", "수빈", "수윤", "숙행", "숙희", "스텔라장", "승희", "시연", "신고은", "신보라", "신비", "신신애", "신지", "신지수", "신효범", "심수봉", "심은진", "ㅇ", "아리", "아린", "아유미", "아이린", "아이린", "아이비", "안선하", "안소미", "안소희", "안신애", "알리", "양소민", "양수경", "양지원", "양지은", "양파", "양하영", "양혜승", "엄지", "엘린", "여름", "여은", "여진", "연정", "연지후", "연희", "영지", "예린", "예빈", "예은", "예인", "오산하", "오솔미", "오승은", "오하영", "옥주현", "옥희", "왁스", "왕영은", "요아리", "요요미", "요조", "우기", "우연이", "우이경", "우희", "원미연", "원준희", "유라", "유리", "유리", "유미", "유성은", "유아", "유주", "유지나", "유진", "유채영", "유혜인", "윤경", "윤보미", "윤손하", "윤수현", "윤시내", "윤아", "윤은혜", "윤조", "윤진솔", "윤채경", "윤하", "은가은", "은서", "은정", "은정", "은진", "은채", "은하", "이가은", "이가이", "이나은", "이나은", "이미배", "이미주", "이보람", "이본", "이상미", "이상은", "이소정", "이수민", "이수영", "이수현", "이애란", "이연경", "이영", "이영현", "이예준", "이유애린", "이은", "이은미", "이은하", "이의정", "이자연", "이재영", "이재은", "이정현", "이주연", "이지현", "이지혜", "이진", "이진솔", "이파니", "이하이", "이해나", "이해리", "이현영", "이현지", "이혜영", "이효리", "이희진", "임상아", "임선홍", "임세주", "임정희", "임주리", "ㅈ", "자두", "장규리", "장나라", "장덕", "장미화", "장서영", "장연주", "장영란", "장예은", "장원영", "장은아", "장재인", "장희영", "전민경", "전성초", "전지윤", "전효성", "정미애", "정수라", "정아", "정앙", "정연", "정예인", "정유지", "정윤혜", "정은지", "정인", "정채연", "정화", "제아", "제이민", "제이스", "제인", "조갑경", "조미미", "조시윤", "조원선", "조유리", "조은새", "조이", "조이현", "조정민", "조현아", "조현영", "주니엘", "주이", "주현미", "주희", "지세희", "지수"
};
	String[] paddr={"강남구", "강동구", "강북구", "강서구 ", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구 ", "중랑구"};
	String[] num= {"02",  "031",  "032",  "033",  "041",  "042",  "043",  "044",  "051",  "052",  "053",  "054",  "055",  "061",  "062",  "063",  "064"};
	String[] domain= {"naver.com","daum.net","gmail.com","hanmail.net","live.co.kr","nate.com"," acts.ac.kr", "ad.hongik.ac.kr", "admgrad.inha.ac.kr", "af.ac.kr", "afd.khu.ac.kr", "ajou.ac.kr", "aks.ac.kr", "alu.ac.kr", "andong.ac.kr", "ansan.ac.kr", "anyang.ac.kr", "arts.hongik.ac.kr", "arts.sejong.ac.kr", "artsmba.hongik.ac.kr", "asc.ac.kr", "assist.ac.kr", "baewha.ac.kr", "bau.ac.kr", "bbts.ac.kr", "bc.ac.kr", "bdu.ac.kr", "beauty.ysu.ac.kr", "berea.ac.kr", "best.andong.ac.kr", "bible.ac.kr", "bist.ac.kr", "bit.kookmin.ac.kr", "biz.deu.ac.kr", "biz.hufs.ac.kr", "biz.inha.ac.kr", "biz.korea.ac.kr", "bizone.gnu.ac.kr", "bmse.hanyang.ac.kr", "bnue.ac.kr", "bpu.ac.kr", "bscu.ac.kr", "bsks.ac.kr", "bu.ac.kr", "bufs.ac.kr", "bugs.ac.kr", "busanarts.ac.kr", "business.inu.ac.kr", "bwc.ac.kr", "ca.ac.kr", "calvin.ac.kr", "cam.kumoh.ac.kr", "cart.smu.ac.kr", "catholic.ac.kr", "cau.ac.kr", "caugs.cau.ac.kr", "caugsce.org", "caugugak.com", "causd.cau.ac.kr", "cbmba.chungbuk.ac.kr", "cbs.cha.ac.kr", "ccn.ac.kr", "cde.unist.ac.kr", "cdu.ac.kr", "cec.knu.ac.kr", "ch.ac.kr", "cha.ac.kr", "changwon.ac.kr", "chongshin.ac.kr", "chosun.ac.kr", "chsu.ac.kr", "chu.ac.kr", "chugye.ac.kr", "chungbuk.ac.kr", "chungwoon.ac.kr", "cipp.hongik.ac.kr", "CJE.AC.KR", "cju.ac.kr", "ck.ac.kr", "cku.ac.kr", "cms.dankook.ac.kr", "cms.kornu.ac.kr", "cms.pknu.ac.kr", "cms.wonkwang.ac.kr", "cms1.ks.ac.kr", "cmu.ac.kr", "cnc.ac.kr", "cnsu.ac.kr", "cntu.ac.kr", "cnu.ac.kr", "cnue.ac.kr", "cnugpp.jnu.ac.kr", "cnugspp.jnu.ac.kr", "cobman.pusan.ac.kr", "coe.pknu.ac.kr", "college.hhi.co.kr", "college.kangwon.ac.kr", "communication.yonsei.ac.kr", "compro.kw.ac.kr", "con.kumoh.ac.kr", "corea.ac.kr", "cpu.ac.kr", "creativeschool.net", "cs.ac.kr", "csj.ac.kr", "cst.ac.kr", "cu.ac.kr", "cue.ac.kr", "cufs.ac.kr", "cuk.ac.kr", "cuk.edu", "cul.duksung.ac.kr", "cul.inu.ac.kr", "culture.jnu.ac.kr", "culture.yewon.ac.kr", "culturegrad.hoseo.ac.kr", "cup.ac.kr", "cyber.joongbu.ac.kr", "dacine.dankook.ac.kr", "daedong.ac.kr", "daegu.ac.kr", "daejeon.ac.kr", "daejin.ac.kr", "daelim.ac.kr", "daeshin.ac.kr", "daewon.ac.kr", "dalp.donga.ac.kr", "dankook.ac.kr", "dcatholic.ac.kr", "dcg.hongik.ac.kr", "dcu.ac.kr", "ddu.ac.kr", "dent.hallym.ac.kr", "dent.jbnu.ac.kr", "dent.jnu.ac.kr", "dent.knu.ac.kr", "dent.korea.ac.kr", "dent.pusan.ac.kr", "dental.khu.ac.kr", "dentist.ewha.ac.kr", "dentistry.ajou.ac.kr", "dentistry.snu.ac.kr", "dentistry.yonsei.ac.kr", "dept.cu.ac.kr", "dept.inu.ac.kr", "designgds.kookmin.ac.kr", "designgrad.daegu.ac.kr", "designgs.konkuk.ac.kr", "desindadm.daegu.ac.kr", "deu.ac.kr", "dgau.ac.kr", "dgist.ac.kr", "dgsi.donga.ac.kr", "dhc.ac.kr", "dhu.ac.kr", "dhw.ut.ac.kr", "dhw.ut.kr", "dic.dongguk.edu", "dima.ac.kr", "dist.ac.kr", "dit.ac.kr", "divinity.hoseo.ac.kr", "dju.ac.kr", "dkc.ac.kr", "dnue.ac.kr", "donga.ac.kr", "dongac.ac.kr", "dongbang.ac.kr", "dongduk.ac.kr", "dongguk.edu", "dongju.ac.kr", "dongnam.ac.kr", "dongseo.ac.kr", "dongyang.ac.kr", "doowon.ac.kr", "dorip.ac.kr", "dpc.ac.kr", "dst.ac.kr", "dsu.ac.kr", "dtu.ac.kr", "du.ac.kr", "duc.ac.kr", "duksung.ac.kr", "dyu.ac.kr", "econo.yonsei.ac.kr", "edu.ajou.ac.kr", "edu.bufs.ac.kr", "edu.chungbuk.ac.kr", "edu.cu.ac.kr", "edu.khu.ac.kr", "edu.kumoh.ac.kr", "edu.pcu.ac.kr", "edu.sejong.ac.kr", "edu.smu.ac.kr", "edu.ssu.ac.kr", "edu.ulsan.ac.kr", "edu.yu.ac.kr", "education.deu.ac.kr", "education.duksung.ac.kr", "edugrad.daegu.ac.kr", "edugrad.inha.ac.kr", "edugrad.korea.ac.kr", "edugrad.silla.ac.kr", "edugradu.kangwon.ac.kr", "edupro.hannam.ac.kr", "edutop.jnu.ac.kr", "egc.cnu.ac.kr", "egrad.chungwoon.ac.kr", "egs.mokwon.ac.kr", "emba.ac.kr", "enggra.korea.ac.kr", "engrad.inha.ac.kr", "ental.yu.ac.kr", "eprint.jbnu.ac.kr", "eulji.ac.kr", "ewha.ac.kr", "ewhamed.ac.kr", "eyonsei.yonsei.ac.kr", "ezra.ac.kr", "g-arch.hongik.ac.kr", "ga.wonkwang.ac.kr", "gachon.ac.kr", "gad.catholic.ac.kr", "gam.cha.ac.kr", "gangdong.ac.kr", "gat.cha.ac.kr", "gba.catholic.ac.kr", "gba.kookmin.ac.kr", "gbiz.sogang.ac.kr", "gbpa.kongju.ac.kr", "gc.ac.kr", "gch.ac.kr", "gcp.cha.ac.kr", "gcs.catholic.ac.kr", "gds.kookmin.ac.kr", "ged.catholilc.ac.kr", "ged.ewha.ac.kr", "gedu.kw.ac.kr", "gedu.uos.ac.kr", "geit.pusan.ac.kr", "gengineer.uos.ac.kr", "gest.cnu.ac.kr", "gfdm.hongik.ac.kr", "ggolf.bufs.ac.kr", "ggs.sunchon.ac.kr", "ggu.ac.kr", "ghe.yonsei.ac.kr", "ghrd.cau.ac.kr", "ghu.ac.kr", "gift.postech.ac.kr", "gii.mokwon.ac.kr", "gima.bufs.ac.kr", "gima.pufs.ac.kr", "gimcheon.ac.kr", "gimhae.ac.kr", "ginue.ac.kr", "gip.khu.ac.kr", "gist.ac.kr", "gjcatholic.ac.kr", "gjcu.ac.kr", "gju.ac.kr", "gjue.ac.kr", "glip.kangwon.ac.kr", "global.ac.kr", "globalpharm.ajou.ac.kr", "gnppcnu.org", "gntech.ac.kr", "gnu.ac.kr", "gnue.ac.kr", "gpa.korea.ac.kr", "gpc.ac.kr", "gr-art.donga.ac.kr", "gr.nsu.ac.kr", "gra.donga.ac.kr", "gra.hannam.ac.kr", "grad.ajou.ac.kr", "grad.bdu.ac.kr", "grad.cha.ac.kr", "grad.cnu.ac.kr", "grad.cufs.ac.kr", "grad.cuk.edu", "grad.daegu.ac.kr", "grad.daejin.ac.kr", "grad.dcu.ac.kr", "grad.gimcheon.ac.kr", "grad.hallym.ac.kr", "grad.hoseo.ac.kr", "grad.inha.ac.kr", "grad.inu.ac.kr", "grad.iscu.ac.kr", "grad.khcu.ac.kr", "grad.kiu.ac.kr", "grad.kku.ac.kr", "grad.knou.ac.kr", "grad.knu.ac.kr", "grad.knue.ac.kr", "grad.konkuk.ac.kr", "grad.kornu.ac.kr", "grad.scu.ac.kr", "grad.silla.ac.kr", "grad.smu.ac.kr", "grad.smuc.ac.kr", "grad.snue.ac.kr", "grad.ssu.ac.kr", "grad.ulsan.ac.kr", "grad.uu.ac.kr", "grad2.kiu.ac.kr", "grad3.kiu.ac.kr", "gradedu.gnu.ac.kr", "gradedu.hongik.ac.kr", "gradpadm.inu.ac.kr", "gradsea.jnu.ac.kr", "gradu.kkot.ac.kr", "gradu.uhs.ac.kr", "graduate.dnue.ac.kr", "graduate.duksung.ac.kr", "graduate.ewha.ac.kr", "graduate.gnu.ac.kr", "graduate.gu.ac.kr", "graduate.inje.ac.kr", "graduate.jnu.ac.kr", "graduate.kangwon.ac.kr", "graduate.kcu.ac.kr", "graduate.korea.ac.kr", "graduate.pcu.ac.kr", "graduate.pknu.ac.kr", "graduate.pusan.ac.kr", "graduate.sejong.ac.kr", "graduate.sjcu.ac.kr", "graduate.sunmoon.ac.kr", "graduate.uos.ac.kr", "graduate.yonsei.ac.kr", "graduate.yu.ac.kr", "graduatebusiness.sejong.ac.kr", "graduation.andong.ac.kr", "gradusport.khu.ac.kr", "grast.cnu.ac.kr", "grd.deu.ac.kr", "grd.kangnam.ac.kr", "grd.kw.ac.kr", "grec.dankook.ac.kr", "greenschool.korea.ac.kr", "gs.cha.ac.kr", "gs.dongguk.edu", "gs.hansung.ac.kr", "gs.hycu.ac.kr", "gs.jejunu.ac.kr", "gs.mju.ac.kr", "gs.mokwon.ac.kr", "gs.stu.ac.kr", "gsa.cau.ac.kr", "gsaek.kookmin.ac.kr", "gsaim.cau.ac.kr", "gsaku.ac.kr", "gsart.yu.ac.kr", "gsb.kmu.ac.kr", "gsb.snu.ac.kr", "gsb.wonkwang.ac.kr", "gsba.dongguk.edu", "gsba.jbnu.ac.kr", "gsba.kangwon.ac.kr", "gsba.kw.ac.kr", "gsba.sunchon.ac.kr", "gsba.yu.ac.kr", "gsbs.dongguk.edu", "gsc.sunchon.ac.kr", "gsca.dongguk.edu", "gsccph.ewha.ac.kr", "gsci.dongguk.edu", "gscit.korea.ac.kr", "gscom.sogang.ac.kr", "gscp.hanyang.ac.kr", "gscp.yu.ac.kr", "gscst.snu.ac.kr", "gsct.smu.ac.kr", "gsd.ewha.ac.kr", "gsd.uos.ac.kr", "gsdd.cnu.ac.kr", "gse.andong.ac.kr", "gse.cau.ac.kr", "gse.donga.ac.kr", "gse.hanyang.ac.kr", "gse.hoseo.ac.kr", "gse.hufs.ac.kr", "gse.inje.ac.kr", "gse.jbnu.ac.kr", "gse.knu.ac.kr", "gse.konkuk.ac.kr", "gse.mju.ac.kr", "gse.sunchon.ac.kr", "gse.yonsei.ac.kr", "gsecono.sogang.ac.kr", "gsedu.dongguk.edu", "gsedu.jbnu.ac.kr", "gsedu.jejunu.ac.kr", "gsedu.pusan.ac.kr", "gsedu.sogang.ac.kr", "gsen.hanyang.ac.kr", "gsep.snu.ac.kr", "gses.kw.ac.kr", "gses.snu.ac.kr", "gsge.kookmin.ac.kr", "gsgf-k.pknu.ac.kr", "gsi.bufs.ac.kr", "gsi.chungbuk.ac.kr", "gsi.jejunu.ac.kr", "gsi.kangwon.ac.kr", "gsi.sunchon.ac.kr", "gsi.yonsei.ac.kr", "gsiai.dongguk.edu", "gsias.hufs.ac.kr", "gsiat.snu.ac.kr", "gsic.hanyang.ac.kr", "gsim.bufs.ac.kr", "gsim.sunmoon.ac.kr", "gsind.jejunu.ac.kr", "gsinfot.sogang.ac.kr", "gsis.ajou.ac.kr", "gsis.cau.ac.kr", "gsis.donga.ac.kr", "gsis.ewha.ac.kr", "gsis.hanyang.ac.kr", "gsis.knu.ac.kr", "gsis.kongju.ac.kr", "gsis.korea.ac.kr", "gsis.pusan.ac.kr", "gsis.snu.ac.kr", "gsis.sogang.ac.kr", "gsis.yonsei.ac.kr", "gsist.yu.ac.kr", "gsit.bufs.ac.kr", "gsit.hufs.ac.kr", "gsit.jbnu.ac.kr", "gsit.jnu.ac.kr", "gsit.konkuk.ac.kr", "gsit.postech.ac.kr", "gsjmc.hanyang.ac.kr", "gskfl.hufs.ac.kr", "gskh.khu.ac.kr", "gslaw.dongguk.edu", "gsles.korea.ac.kr", "gslp.dankook.ac.kr", "gsm.dongguk.ac.kr", "gsm.khu.ac.kr", "gsmc.sogang.ac.kr", "gsn.cau.ac.kr", "gsn.hallym.ac.kr", "gsosw.ssu.ac.kr", "gsot.sogang.ac.kr", "gsp.khu.ac.kr", "gspa.cau.ac.kr", "gspa.dongguk.edu", "gspa.jbnu.ac.kr", "gspa.jejunu.ac.kr", "gspa.kookmin.ac.kr", "gspa.pusan.ac.kr", "gspa.snu.ac.kr", "gspa.yonsei.ac.kr", "gspa.yu.ac.kr", "gspcj.dongguk.edu", "gsph.cnu.ac.kr", "gsph.eulji.ac.kr", "gsph.hanyang.ac.kr", "gsph.yonsei.ac.kr", "gspl.ac.kr", "gsports.cha.ac.kr", "gspp.hanyang.ac.kr", "gspp.sogang.ac.kr", "gspp.ulsan.ac.kr", "gsps.cau.ac.kr", "gsps.hufs.ac.kr", "gspt.ac.kr", "gsres.konkuk.ac.kr", "gss.dongguk.ac.kr", "gss.korea.ac.kr", "gsse.jejunu.ac.kr", "gsse.skhu.ac.kr", "gst.bufs.ac.kr", "gsti.ewha.ac.kr", "gstlg.skhu.ac.kr", "gstm-kor.unist.ac.kr", "gstm.khu.ac.kr", "gsus.hanyang.ac.kr", "gsv.hoseo.ac.kr", "gsw.ewha.ac.kr", "gtax.uos.ac.kr", "gtec.ac.kr", "gts.ac.kr", "gu.ac.kr", "gufot.ac.kr", "gumi.ac.kr", "gumi.kopo.ac.kr", "gupd.hanyang.ac.kr", "gurbans.uos.ac.kr", "gw.ac.kr", "gwangju.ac.kr", "gwnu.ac.kr", "gy.ac.kr", "gyc.ac.kr", "gyeongan.ac.kr", "halla.ac.kr", "hanbat.ac.kr", "handong.edu", "hanil.ac.kr", "hanlyo.ac.kr", "hannam.ac.kr", "hansei.ac.kr", "hanseo.ac.kr", "hansung.ac.kr", "hanyang.ac.kr", "hanyeong.ac.kr", "hapdong.ac.kr", "hcg.ac.kr", "health.gnu.ac.kr", "health.jejunu.ac.kr", "health.knu.ac.kr", "health.snu.ac.kr", "heritage.kongju.ac.kr", "hipa.hongik.ac.kr", "his.pusan.ac.kr", "hit.ac.kr", "hj.ac.kr", "hknu.ac.kr", "home.inje.ac.kr", "home.seowon.ac.kr", "home.sorabol.ac.kr", "homepage.inje.ac.kr", "homepage.sch.ac.kr", "hompi.sogang.ac.kr", "honam.ac.kr", "hongik.ac.kr", "hongik.edu", "hongikfashion.com", "hosan.ac.kr", "hoseo.ac.kr", "host.kongju.ac.kr", "howon.ac.kr", "hs.ac.kr", "hsc.ac.kr", "hscu.ac.kr", "htus.ac.kr", "hufs.ac.kr", "hugs.ac.kr", "hycu.ac.kr", "hydng.hanyang.ac.kr", "hyo.ac.kr", "hytu.ac.kr", "hytu.ac.kr.", "hywoman.ac.kr", "ibiz.hallym.ac.kr", "iccu.ac.kr", "icgrad.silla.ac.kr", "ict.ac.kr", "ict.ajou.ac.kr", "idas.hongik.ac.kr", "ieccu.jnu.ac.kr", "iem.cau.ac.kr", "ifl.kookmin.ac.kr", "igse.ac.kr", "iksan.kopo.ac.kr", "ikw.ac.kr", "ilbangrad.hongik.ac.kr", "ils.inha.ac.kr", "ime.korea.ac.kr", "ind.cnu.ac.kr", "ind.knu.ac.kr", "indu.pusan.ac.kr", "induk.ac.kr", "industry.deu.ac.kr", "industry.hongik.ac.kr", "industry.inu.ac.kr", "industry.ulsan.ac.kr", "info.daegu.ac.kr", "information.inu.ac.kr", "information.kangwon.ac.kr", "inha.ac.kr", "inhatc.ac.kr", "inje.ac.kr", "interlaw.khu.ac.kr", "inu.ac.kr", "inugsl.inu.ac.kr", "is.jbnu.ac.kr", "iscu.ac.kr", "isuskor.uos.ac.kr", "isw.kw.ac.kr", "itc.ajou.ac.kr", "itconvergence.inje.ac.kr", "itgrad.inha.ac.kr", "itmba.ssu.ac.kr", "its.ajou.ac.kr", "iuk.ac.kr", "jangan.ac.kr", "jb.ac.kr", "jbnu.ac.kr", "jbsc.ac.kr", "jeiu.ac.kr", "jeju.ac.kr", "jejunu.ac.kr", "jesus.ac.kr", "jhc.ac.kr", "jiu.ac.kr", "jj,ac.kr", "jj.ac.kr", "jmc.yonsei.ac.kr", "jnu.ac.kr", "JNUE.KR", "jnumba.jejunu.ac.kr", "joongbu.ac.kr", "journalism.semyung.ac.kr", "jtu.ac.kr", "jungsu.kopo.ac.kr", "jvision.ac.kr", "jwu.ac.kr", "kaist.ac.kr", "kangnam.ac.kr", "kangseo.kopo.ac.kr", "kangwon.ac.kr", "kangwonlaw.ac.kr", "karts.ac.kr", "kau.ac.kr", "KAYA.AC.KR", "kaywon.ac.kr", "kbc.ac.kr", "kbsc.ac.kr", "kbtus.ac.kr", "kbu.ac.kr", "kcc.ac.kr", "kcgu.ac.kr", "kcn.ac.kr", "kcu.ac", "kcu.ac.kr", "kdischool.ac.kr", "kdu.ac.kr", "kduniv.ac.kr", "kfu.kdb.co.kr", "kg.ac.kr", "kgrc.ac.kr", "khcu.ac.kr", "khls.ac.kr", "khmba.khu.ac.kr", "khu.ac.kr", "khu.communication.ac.kr", "khusm.khu.ac.kr", "kijeon.ac.kr", "kimpo.ac.kr", "kings.ac.kr", "kit.ac.kr", "kiu.ac.kr", "kiwu.ac.kr", "kkot.ac.kr", "kku.ac.kr", "klc.ac.kr", "kmcu.ac.kr", "kmed.pusan.ac.kr", "kmedu.kmu.ac.kr", "kmou.ac.kr", "kmu.ac.kr", "knou.ac.kr", "knsu.ac.kr", "knu.ac.kr", "knue.ac.kr", "knuw.ac.kr", "koje.ac.kr", "kongju.ac.kr", "konkuk.ac.kr", "konyang.ac.kr", "kookje.ac.kr", "kookmin.ac.kr", "kopo.ac.kr", "kopo.ac.kr", "kopo.ac.kr", "kopolicy.korea.ac.kr", "korea.ac.kr", "korealabor.ac.kr", "koreatech.ac.kr", "kornu.ac.kr", "kosin.ac.kr", "kpu.ac.kr", "ks.ac.kr", "kt.ac.kr", "ktc.ac.kr", "kts.ac.kr", "ktu.ac.kr", "kua.ac.kr", "kugsph.ac.kr", "kuis.ac.kr", "kukistschool.korea.ac.kr", "kulawschool.korea.ac.kr", "kumoh.ac.kr", "kunjang.ac.kr", "kunsan.ac.kr", "kw.ac.kr", "kwangshin.ac.kr", "kwcl.ac.kr", "kwu.ac.kr", "ky.kku.ac.kr", "kycu.ac.kr", "kyeyak.ac.kr", "kygrad.konyang.ac.kr", "kyonggi.ac.kr", "kyungmin.ac.kr", "kyungnam.ac.kr", "law.cau.ac.kr", "law.chungbuk.ac.kr", "law.cnu.ac.kr", "law.donga.ac.kr", "law.hufs.ac.kr", "law.kangwon.ac.kr", "law.pusan.ac.kr", "law.snu.ac.kr", "lawnbiz.ysu.ac.kr", "laws.jbnu.ac.kr", "lawschool.ajou.ac.kr", "lawschool.cbnu.ac.kr", "lawschool.chonnam.ac.kr", "lawschool.ewha.ac.kr", "lawschool.hanyang.ac.kr", "lawschool.jbnu.ac.kr", "lawschool.jejunu.ac.kr", "lawschool.knu.ac.kr", "lawschool.konkuk.ac.kr", "lawschool.sogang.ac.kr", "lawschool.uos.ac.kr", "lawschool.wonkwang.ac.kr", "lawschool.yonsei.ac.kr", "lawschool.yu.ac.kr", "leader.hoseo.ac.kr", "leadergrad.silla.ac.kr", "lh.gnu.ac.kr", "logistics.inha.ac.kr", "ltu.ac.kr", "manage.hoseo.ac.kr", "masan.ac.kr", "mass.konkuk.ac.kr", "mba.ajou.ac.kr", "mba.cau.ac.kr", "mba.cnu.ac.kr", "mba.donga.ac.kr", "mba.dongguk.edu", "mba.ewha.ac.kr", "mba.hannam.ac.kr", "mba.hanyang.ac.kr", "mba.hongik.ac.kr", "mba.jnu.ac.kr", "mba.knou.ac.kr", "mba.konkuk.ac.kr", "mba.ssu.ac.kr", "mba.ulsan.ac.kr", "mba.uos.ac.kr", "mba.yonsei.ac.kr", "mcu.ac.kr", "med.cau.ac.kr", "med.dongguk.ac.kr", "med.jbnu.ac.kr", "med.knu.ac.kr", "mediacom.korea.ac.kr", "medical.jejunu.ac.kr", "medicine.catholic.ac.kr", "medicine.cha.ac.kr", "medicine.cnu.ac.kr", "medicine.donga.ac.kr", "medicine.gnu.ac.kr", "medicine.inha.ac.kr", "medicine.jnu.ac.kr", "medicine.kku.ac.kr", "medicine.korea.ac.kr", "medicine.pusan.ac.kr", "medicine.snu.ac.kr", "medicine.yonsei.ac.kr", "medix.hanyang.ac.kr", "medweb.cbnu.ac.kr", "mft.smu.ac.kr", "mjc.ac.kr", "mjedu.mju.ac.kr", "mju.ac.kr", "mkc.ac.kr", "mmu.ac.kr", "mokpo-c.ac.kr", "mokpo.ac.kr", "mokwon.ac.kr", "mot.hanyang.ac.kr", "mot.hoseo.ac.kr", "mot.korea.ac.kr", "mot.pknu.ac.kr", "mot.unist.ac.kr", "motor.ac.kr", "mtu.ac.kr", "my.ewha.ac.kr", "nambu.ac.kr", "namhae.ac.kr", "ncc-gcsp.ac.kr", "nds.hannam.ac.kr", "newclass.hanbat.ac.kr", "newcms.kmu.ac.kr", "ngo.khu.ac.kr", "niu.ac.kr", "nk.ac.kr", "nongchuk.konkuk.ac.kr", "nonghyup.ac.kr", "nrls.jbnu.ac.kr", "nsu.ac.kr", "nuch.ac.kr", "nursingcollege.yonsei.ac.kr", "ocu.ac.kr", "office.dju.kr", "ok.ac.kr", "orient.wonkwang.ac.kr", "osan.ac.kr", "osu.ac.kr", "padm.gnu.ac.kr", "paekche.ac.kr", "pagrad.konkuk.ac.kr", "pbhealth.korea.ac.kr", "pcu.ac.kr", "pegr.pusan.ac.kr", "performarts.ewha.ac.kr", "pharm.cau.ac.kr", "pioneer.yonsei.ac.kr", "pknu.ac.kr", "pknuedu.pknu.ac.kr", "pnc.khu.ac.kr", "pohang.ac.kr", "police.donga.ac.kr", "policy.kmu.ac.kr", "pom.wonkwang.ac.kr", "portal.changwon.ac.kr", "postech.ac.kr", "pro.ac.kr", "psm.chungbuk.ac.kr", "psm.hongik.ac.kr", "pspsk.yu.ac.kr", "psy.cha.ac.kr", "psygrad.silla.ac.kr", "ptu.ac.kr", "ptu.posco.co.kr:4443", "pub.ajou.ac.kr", "pub.sejong.ac.kr", "pubcnu.org", "public.deu.ac.kr", "pusan.ac.kr", "puts.ac.kr", "realestate.deu.ac.kr", "realestate.ysu.ac.kr", "record.mju.ac.kr", "rehabgrad.daegu.ac.kr", "rts.ac.kr", "saekyung.ac.kr", "safegrad.silla.ac.kr", "safety.deu.ac.kr", "san.ajou.ac.kr", "sangha.ac.kr", "sangji.ac.kr", "sanup.gnu.ac.kr", "sau.ac.kr", "sb.ac.kr", "SC.AC.KR", "scau.ac.kr", "sch.ac.kr", "scu.ac.kr", "sdc.ac.kr", "sdu.ac.kr", "sedu.konkuk.ac.kr", "sehan.ac.kr", "sejong.ac.kr", "sejong.hongik.ac.kr", "sejong.korea.ac.kr", "semyung.ac.kr", "seoil.ac.kr", "seojeong.ac.kr", "seoksa.knu.ac.kr", "seoularts.ac.kr", "seoulech.ac.kr", "seoultech.ac.kr", "seowon.ac.kr", "seoyeong.ac.kr", "sewc.ac.kr", "sgcs.ssu.ac.kr", "sgmot.sogang.ac.kr", "sgraduate.pcu.ac.kr", "sgs.hanyang.ac.kr", "sgsae.gnu.ac.kr", "sgu.ac.kr", "sh.kku.ac.kr", "shinan.hongik.ac.kr", "shinbang.cau.ac.kr", "shingu.ac.kr", "shinhan.ac.kr", "shinhan.ac.kr", "shinsung.ac.kr", "shu.ac.kr", "silla.ac.kr", "site.dongguk.ac.kr", "sjcu.ac.kr", "sjs.ac.kr", "skhu.ac.kr", "skku.edu", "skuniv.ac.kr", "small.ssu.ac.kr", "smed.kangwon.ac.kr", "smit.ac.kr", "smu.ac.kr", "smuc.ac.kr", "smugrade.semyung.ac.kr", "snjc.ac.kr", "snu.ac.kr", "snue.ac.kr", "social.knu.ac.kr", "society.yewon.ac.kr", "socwel.daegu.ac.kr", "sogang.ac.kr", "sohae.ac.kr", "songeui.catholic.ac.kr", "songeui1.catholic.ac.kr", "songgok.ac.kr", "songho.ac.kr", "songwon.ac.kr", "songwon.ac.kr", "sookmyung.ac.kr", "sopa.chungbuk.ac.kr", "special.kongju.ac.kr", "spedgrad.daegu.ac.kr", "sph.hallym.ac.kr", "sport.yu.ac.kr", "sports.kookmin.ac.kr", "sportscience.hoseo.ac.kr", "ss.kongju.ac.kr", "ssc.ac.kr", "ssgu.ac.kr", "ssu.ac.kr", "ssw.hallym.ac.kr", "sswy.yonsei.ac.kr", "startup.kmu.ac.kr:453", "sts@sts.ac.kr", "stu.ac.kr", "sub.ac.kr", "sub.ginue.ac.kr", "sufs.ac.kr", "suncheon.ac.kr", "sunchon.ac.kr", "sungkyul.edu", "sungshin.ac.kr", "sungsim.ac.kr", "sunhakup.ac.kr", "sunlin.ac.kr", "sunmoon.ac.kr", "suwon", "suwon.ac.kr", "suwoncatholic.ac.kr", "svu.ac.kr", "swgs.kookmin.ac.kr", "swu.ac.kr", "swwu.ac.kr", "sy.ac.kr", "syu.ac.kr", "teacher.wonkwang.ac.kr", "tec.kumoh.ac.kr", "technoent.pusan.ac.kr", "technology.kongju.ac.kr", "ted.kookmin.ac.kr", "tesolgs.hufs.ac.kr", "theology.hannam.ac.kr", "theology.mokwon.ac.kr", "tk.ac.kr", "tlbu.ac.kr", "top.hannam.ac.kr", "totalart.kookmin.ac.kr", "tourgrad.sejong.ac.kr", "tourism.hanyang.ac.kr", "tourism.khu.ac.kr", "translator.sunmoon.ac.kr", "ts.ajoumc.or.kr", "tsu.ac.kr", "ttc.ac.kr", "ttgu.ac.kr", "tu.ac.kr", "tw.ac.kr", "u1.ac.kr", "ube.ac.kr", "uc.ac.kr", "uhs.ac.kr", "ulsan.ac.kr", "unist.ac.kr", "uos.ac.kr", "ust.ac.kr", "ut.ac.kr", "uu.ac.kr", "wac.smu.ac.kr", "wat.ac.kr", "wdu.ac.kr", "web.dongguk.ac.kr", "web.kmu.ac.kr", "webbuild.knu.ac.kr", "welfare.donga.ac.kr", "welfare.mju.ac.kr", "wfu.pknu.ac.kr", "wgs.wonkwang.ac.kr", "wgst.ac.kr", "wonbuddhism.ac.kr", "wonkwang.ac.kr", "woosuk.ac.kr", "world.ac.kr", "wsi.ac.kr", "wsu.ac.kr", "wu.ac.kr", "www1.gntech.ac.kr", "www5.sangji.ac.kr", "yc.ac.kr", "ycc.ac.kr", "yeonsung.ac.kr", "yewon.ac.kr", "yflc.ac.kr", "ygu.ac.kr", "yit.ac.kr", "yju.ac.kr", "ync.ac.kr", "yncu.ac.kr", "yonam.ac.kr", "yongin.ac.kr", "yongmoon.ac.kr", "yonsei.ac.kr", "yonseigsgb.ac.kr", "youngsan.ac.kr", "ysc.ac.kr", "ysu.ac.kr", "ysugst.yonsei.ac.kr", "ytus.ac.kr", "yu.ac.kr", "yueg.yewon.ac.kr", "yuhan.ac.kr"
};
	String[] bestSeller= {"가시고기", "해리포터와 마법사의 돌 1", "부자 아빠 가난한 아빠", "국화꽃 향기", "영어공부 절대로 하지마라!", "해리 포터와 비밀의 방", "누가 내 치즈를 옮겼을까", "느리게 산다는 것의 의미", "노자와 21세기", "만행 하버드에서 회계사까지", "누가 내 치즈를 옮겼을까", "상도 1", "국화꽃 향기 1", "부자 아빠 가난한 아빠", "THE BLUE DAY BOOK[1]", "가시고기", "이윤기의 그리스 로마 신화 1", "느리게 산다는 것의 의미", "해리포터와 마법사의 돌 1", "힐링 소사이어티", "아홉 살 인생", "봉순이 언니", "그 많던 싱아는 누가 다 먹었을까", "오페라의 유령", "괭이부리말 아이들", "연탄길 1", "뇌(상)", "그러나 나는 살아가리라", "화", "모랫말 아이들", "나무", "톨스토이 단편선", "파페포포 메모리즈", "야생초 편지", "화", "한국의 부자들", "설득의 심리학", "지상의 숟가락 하나", "내 생애의 아이들", "칭찬은 고래도 춤추게 한다", "연금술사", "다빈치 코드 1", "선물", "설득의 심리학", "아침형 인간", "나무", "그남자 그여자", "칼의 노래 1", "꽃으로도 때리지 말라", "세상의 중심에서 사랑을 외치다", "살아 있는 동안 꼭 해야 할 49가지", "다빈치 코드 1", "모모", "연금술사", "블루오션전략", "사랑하라 한번도 상처받지 않은 것처럼", "해커스 토익(READING)", "1010 대한민국 트렌드", "해리포터와 혼혈왕자 1", "설득의 심리학", "마시멜로 이야기", "우리들의 행복한 시간", "끌리는 사람은 1%가 다르다", "해커스 토익(READING)", "인생 수업", "배려", "부의 미래", "긍정의 힘", "살아 있는 것은 다 행복하라", "해커스 토익(LISTENING)", "멈추면 비로소 보이는 것들", "꾸뻬씨의 행복여행", "색채가 없는 다자키 쓰쿠루와 그가 순례를 떠난 해", "정글만리, 1", "나미야 잡화점의 기적", "김미경의 드림 온", "적을 만들지 않는 대화법", "습관의 힘", "해커스 토익 보카", "나는 죽을 때까지 재미있게 살고싶다", "창문 넘어 도망친 100세 노인", "미 비포 유", "어떤 하루", "내가 사랑한 유럽 TOP10", "감정수업", "에드워드 툴레인의 신기한 여행", "여자 없는 남자들", "나미야 잡화점의 기적", "1cm+", "정글만리 1", "미움받을 용기", "지적 대화를 위한 넓고 얕은 지식", "비밀의 정원", "나미야 잡화점의 기적", "지적 대화를 위한 넓고 얕은 지식: 현실너머 편", "하버드 새벽 4시 반", "오베라는 남자", "창문 넘어 도망친 100세 노인", "백종원이 추천하는 집밥 메뉴 51", "해커스 토익 보카(전면개정판)", "채식주의자", "완벽하지 않은 것들에 대한 사랑", "미움받을 용기", "설민석의 조선왕조실록", "나미야 잡화점의 기적", "지적 대화를 위한 넓고 얕은 지식", "사피엔스", "나에게 고맙다", "미움받을 용기 1", "자존감 수업", "언어의 온도", "81년생 김지영", "자존감 수업", "나미야 잡화점의 기적", "나는 나로 살기로 했다", "말의 품격", "보노보노처럼 살다니 다행이야(특별판)", "기사단장 죽이기 1: 현현하는 이데아", "살인자의 기억법", "설민석의 조선왕조실록", "곰돌이 푸, 행복한 일은 매일 있어", "모든 순간이 너였다", "무례한 사람에게 웃으며 대처하는 법", "81년생 김지영", "나는 나로 살기로 했다", "언어의 온도", "죽고 싶지만 떡볶이는 먹고 싶어", "돌이킬 수 없는 약속", "나미야 잡화점의 기적", "역사의 역사", "여행의 이유", "고요할수록 밝아지는 것들", "나는 나로 살기로 했다", "90년생이 온다", "철학은 어떻게 삶의 무기가 되는가", "봉제인형 살인사건", "아주 작은 습관의 힘", "꽃을 보듯 너를 본다", "돌이킬 수 없는 약속", "흔한남매. 1", "더 해빙(The Having)", "돈의 속성", "아몬드", "하버드 상위 1퍼센트의 비밀", "지적 대화를 위한 넓고 얕은 지식: 제로 편", "존리의 부자되기 습관", "주식투자 무작정 따라하기(2010)", "흔한 남매", "해커스 토익 기출보카 TOEIC VOCA", "내가 원하는 것을 나도 모를 때"};
	
	public String huName() {
		return chooser(hname);
	}
	public String huName(int i) {
		return hname[i];
	}
	public String groupName() {
		return chooser(pname);
	}
	public String groupName(int i) {
		return pname[i];
	}
	public String htel() {
		return chooser(num)+"-"+ran(4,3)+"-"+ran(4);
	}
	
	public String ptel() {
		return "010-"+ran(4,3)+"-"+ran(4);
	}
	public String addr() {
		return chooser(paddr);
	}
	public String dateAgo() {
		//랜덤 날짜 대략 50년 전부터 15년 전까지
		return dateAgo(15,50);
	}
	public String dateAgo(int i) {
		//랜덤 몇년 전
		return dateAgo(0,i);
	}
	
	public String dateAgo(int s,int e) {
		//랜덤 날짜 대략 i년 전부터 i+j년 전까지
		LocalDate date =  LocalDate.now();
		date=date.minusYears((int)(s+Math.random()*e));
		date=date.minusMonths((int)(Math.random()*12));
		date=date.plusDays((int)Math.random()*31);
		return date.toString();
	}
	public String bookChooser() {
		return chooser(bestSeller);
	}
	public String email() {
		String email=String.valueOf(ran('a'));
		email+=ranStr(3+(int)Math.random()*4)+"@"+chooser(domain);
		return email;
	}
	
	public String homepage() {
		// 랜덤 홈페이지 주소 *****.***/** 형태
		String home=ranStr(3+(int)Math.random()*4)+"."+chooser(domain)+"/"+ranStr(4+(int)Math.random()*2);
		return home;
	}
	public String ranStr(int leng) {
		//랜덤 문자열
		String renStr="";
		renStr=String.valueOf(ran('a'));
		for (int i=0; i<leng-1;i++) {
			if(ran(1)<7) {
				renStr+=String.valueOf(ran('a'));
			}else {
				renStr+=String.valueOf(ran(1));
			}
		}
		return renStr;
	}
	public String chooser(String[] str) { // 배열에서 랜덤으로 선택
		return str[(int)(Math.random()*(str.length))];
	}
	public int ran(int leng) { // 3 - 100-999 2 -10-99 10^n-10^n-1
		return ran(leng,leng);
	}
	public char ran(char a) { //문자 랜덤으로 선택
		return (char)(a+(int)(Math.random()*26));
	}
	
	public int ran(int leng,int i) {
		int num= (int)((Math.random()*(Math.pow(10,leng)-Math.pow(10,i-1)))+Math.pow(10,i-1));
		return num;
	}
	public void howMany() {
		System.out.println("저장된 종류의 수를 확인합니다.");
		System.out.println("1. 단체명\t2. 인명\t3.지역명\t4.책제목");
		int i=0;
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt()) {
			case 1 : sc.close(); i=pname.length;break;
			case 2 : sc.close(); i= hname.length;break;
			case 3 : sc.close(); i= paddr.length;break;
			case 4 : sc.close(); i= bestSeller.length;break;
		}
		System.out.println(i);
		
	}
}