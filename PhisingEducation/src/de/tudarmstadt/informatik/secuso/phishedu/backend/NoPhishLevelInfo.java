package de.tudarmstadt.informatik.secuso.phishedu.backend;

import de.tudarmstadt.informatik.secuso.phishedu.R;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.HTTPAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.HomoglyphicAttac;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.HostInPathAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.IPAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.Level2Attack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.MisleadingAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.NonsenseAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.SubdomainAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.TypoAttack;
import de.tudarmstadt.informatik.secuso.phishedu.backend.attacks.Unrelated;

/**
 * This Class represents the information about a Level
 */
public class NoPhishLevelInfo {
	public static final int[] levelTitlesIds = {
		R.string.app_name, R.string.level_title_01,
		R.string.level_title_02, R.string.level_title_03,
		R.string.level_title_04, R.string.level_title_05,
		R.string.level_title_06, R.string.level_title_07,
		R.string.level_title_08, R.string.level_title_09,
		R.string.level_title_10, R.string.level_title_11
	};

	public static final int[] levelSubtitlesIds = {
		R.string.app_name, R.string.level_subtitle_01,
		R.string.level_subtitle_02, R.string.level_subtitle_03,
		R.string.level_subtitle_04, R.string.level_subtitle_05,
		R.string.level_subtitle_06, R.string.level_subtitle_07,
		R.string.level_subtitle_08, R.string.level_subtitle_09,
		R.string.level_subtitle_10, R.string.level_subtitle_11
	};

	public static final int[][] levelIntroLayoutIds = {
		{ R.layout.level_00_intro_00, R.layout.level_00_intro_01
		},
		{ R.layout.level_01_splash, R.layout.level_01_intro_00,
			R.layout.level_01_intro_01, R.layout.level_01_intro_02,
			R.layout.level_01_intro_03
		},
		{ R.layout.level_02_splash, R.layout.level_02_intro_00,
			R.layout.level_02_intro_01, R.layout.level_02_intro_02,
			R.layout.level_02_intro_03, R.layout.level_02_intro_04,
			R.layout.level_02_intro_05, R.layout.level_02_intro_06,
			R.layout.level_02_intro_07, R.layout.level_02_intro_08,
			R.layout.level_02_intro_09, R.layout.level_02_intro_10,
		},
		{ R.layout.level_03_splash, R.layout.level_03_intro_00,
			R.layout.level_03_intro_01, R.layout.level_03_intro_02,
			R.layout.level_03_intro_03
		},
		{ R.layout.level_04_splash, R.layout.level_04_intro_00,
			R.layout.level_04_intro_01, R.layout.level_04_intro_02,
			R.layout.level_04_intro_03
		},
		{ R.layout.level_05_splash, R.layout.level_05_intro_00,
			R.layout.level_05_intro_01, R.layout.level_05_intro_02
		},
		{ R.layout.level_06_splash, R.layout.level_06_intro_00,
			R.layout.level_06_intro_01, R.layout.level_06_intro_02
		},
		{ R.layout.level_07_splash, R.layout.level_07_intro_00,
			R.layout.level_07_intro_01, R.layout.level_07_intro_02,
			R.layout.level_07_intro_03, R.layout.level_07_intro_04,
			R.layout.level_07_intro_05, R.layout.level_07_intro_06
		},
		{ R.layout.level_08_splash, R.layout.level_08_intro_00,
			R.layout.level_08_intro_01, R.layout.level_08_intro_02
		},
		{ R.layout.level_09_splash, R.layout.level_09_intro_00,
			R.layout.level_09_intro_01, R.layout.level_09_intro_02,
			R.layout.level_09_intro_03
		},
		{ R.layout.level_10_splash, R.layout.level_10_intro_00,
			R.layout.level_10_intro_01, R.layout.level_10_intro_02,
			R.layout.level_10_intro_03, R.layout.level_10_intro_04,
			R.layout.level_10_intro_05, R.layout.level_10_intro_06,
			R.layout.level_10_intro_07, R.layout.level_10_intro_08,
			R.layout.level_10_intro_09,
		},
		{ R.layout.level_11_splash_00, R.layout.level_11_intro_00,
			R.layout.level_11_splash_01, R.layout.level_11_intro_01,
			R.layout.level_11_intro_02, R.layout.level_11_intro_03,
			R.layout.level_11_intro_04, R.layout.level_11_splash_02,
			R.layout.level_11_intro_05, R.layout.level_11_intro_06,
			R.layout.level_11_intro_07

		}
	};

	public static final int[][] levelFinishedLayoutIds = {
		{ R.layout.level_00_finish_00, R.layout.level_00_finish_01,
			R.layout.level_00_finish_02, R.layout.level_00_finish_03,
			R.layout.level_00_finish_04, R.layout.level_00_finish_05,
			R.layout.level_00_finish_06, R.layout.level_00_finish_07,
			R.layout.level_00_finish_08
		},
		{ R.layout.level_01_finish_00,}, 
		{ R.layout.level_02_finish_00,}
	};

	//For each level we can define what Attacks are applied
	//LEVEL 0-1 are empty because they don't 
	@SuppressWarnings("rawtypes")
	public static final Class[][] levelAttackTypes = {
		{}, //Level 0: Awareness
		{}, //Level 1: Find URLBar in Browser
		{Level2Attack.class}, //Level 2
		{SubdomainAttack.class}, //Level 3 
		{IPAttack.class}, //Level 4
		{NonsenseAttack.class}, // Level 5
		{Unrelated.class}, // Level 6 
		{MisleadingAttack.class,TypoAttack.class}, //Level 7
		{HomoglyphicAttac.class}, //Level 8
		{HostInPathAttack.class}, //Level 9
		{HTTPAttack.class} //Level 10
	};
	
	public static int levelCount(){
		return levelIntroLayoutIds.length;
	}
	
	public final int titleId;
	public final int subTitleId;
	public final int[] introLayouts;
	public final int[] finishedLayouts;
	public final int levelId;
	@SuppressWarnings("rawtypes")
	public final Class[] attackTypes;
	
	public NoPhishLevelInfo(int levelid){
		this.levelId = levelid;
		this.titleId=levelTitlesIds[levelid];
		this.subTitleId=levelSubtitlesIds[levelid];
		int intro_index = Math.min(levelid, levelIntroLayoutIds.length-1);
		this.introLayouts =levelIntroLayoutIds[intro_index];
		int finished_index = Math.min(levelid, levelFinishedLayoutIds.length-1);
		this.finishedLayouts =levelFinishedLayoutIds[finished_index];
		int attacktype_index = Math.min(levelid, levelAttackTypes.length-1);
		this.attackTypes = levelAttackTypes[attacktype_index];
	}
	
	public int getlevelPoints(){
		return BackendController.getInstance().getLevelPoints(this.levelId);
	}
	
}
