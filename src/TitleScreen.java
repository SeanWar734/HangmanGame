import java.util.Scanner;

public class TitleScreen {

	public static void titleScreen() throws InterruptedException {

		Scanner keyboard = new Scanner(System.in);

		clearScreen();

		String importantInfo[] = { "                                                         /",
				"                      @@@(                            @@@,@@@    @@@@@@#                                                    .@@@@",
				" @@#      @@          @@@@         @@   @@@@@@@@     @@@          @@  (@@%     @@@@@@@@    @@@@@@@          @@@@@@@@       #@@ @@&      %@@  (@@@@@@@&",
				" @@.      @@         @@@&@@        @@,%@@     @@@   ,@@           @@%   @@@    @@@          @@*  @@@      @@@     /@@      @@.  @@.      @@ @@@     @@",
				" @@       @@         @@  @@        @@@@@      @@@   @@@           @@@    @@&   @@@          @@,  ,@@     #@@   @@@@@      @@@   (@@      @@@@@      @@",
				" @@       @@        .@@  @@&       @@@@@      @@/   @@            @@@    ,@@   .@@          @@.  @@/     %@@              @@.    @@,     @@@@.      @@",
				" @@       @@        &@@  (@@       &@@@.      @@.   @@            @@@     @@    @@          @@ @@@        @@             .@@     %@@     @@@@      ,@@",
				",@@       @@        @@,   @@       ,@@@       @@    @@            @@@     @@    @@          @@@@@(        ,@@            @@@      @@     @@@@      &@@",
				",@@       @@        @@    @@%       @@@      ,@@    @@            @@@    %@@    @@.         @@  %@@         @@*          @@,      @@     &@@%      @@@",
				" @@@@@@@@@@@@      /@@    (@@       @@@      @@@    @@            @@%   #@@     @@@@@      /@@   .@@         @@@         @@       @@(    #@@/      @@%",
				" @@       @@*      @@@     @@       @@&      @@@    @@   @@@@     @@*@@@@&      @@/        #@@    @@@         (@@.       @@       @@@    (@@       @@,",
				" @@       @@%      @@      @@#      @@(      @@#    @@     @@/    @@            @@#        &@@     @@           @@&      @@       @@@    *@@       @@",
				" @@,      @@@     /@@      #@@      @@/      @@.    @@     &@@    @@            @@&        @@@     @@%           @@(     @@       #@@    .@@       @@",
				" @@(      @@@     @@@@@@@@@@@@      @@*      @@     @@     .@@    @@            &@#        @@@     %@@     %@@    @@     @@       &@@    .@@      /@@",
				" @@@      @@@     @@        @@/     @@*      @@     @@,     @@    @@            #@(        @@&      @@    @@,,    %@@    @@       @@@    .@@      @@@",
				" @@@      (@@    @@%        @@@     @@/     ,@@     @@&     @@    @@/           &@&        @@#      @@    @@       @@%   @@#      @@     .@@      @@&",
				" @@@      *@@   (@@         ,@@     @@%     @@@     &@@    ,@@    @@@           @@@        @@*      @@    @@%      *@@   @@@     @@%     *@@      @@*",
				" @@&      .@@   @@           @@     @@@     @@@      @@*   @@(    #@@           @@/    *   @@,      @@     @@@     @@@    @@   /@@*      (@@.     @@",
				"           #.  @@*           @@&    @@@     @@.       @@@@@@       @@           @@@@@@@@   @@@      @@@      %@@@@@@      @@@@@@/        %@@      @@",

				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				"                                                      ((",
				"        @@@@/                                         @@@@                               @@@@@*                  @@@@@@@            (@(       @@@",
				"      @@@  @@@      @@@@@@@       @@@@@@@@/          *@@@@      %       .%@@ &@@@@@@@/   ,@@  @@@*               @@%   @@@          @@%      /@@",
				"     @@@            @@@  &@@       @@                @@@&@@     @@@@@@@@(,    @@          @@    #@@.             @@@    (@@         @@       @@@",
				"     @@             @@@   @@       @@                @@  @@         @@        @@          @@      @@&            @@@   ,@@          @@      @@@@",
				"    %@@             @@&  @@@       @@               *@@  @@@        @@        @@          @@(      @@.           &@@&@@@&           @@     @@@@&",
				"    @@@             @@/@@@         @@,              @@@  ,@@        @@        @@,         @@&      &@@           (@@ (@@@@@         @@    @@@@@&",
				"    @@/             @@@@@@         @@@              @@    @@        @@        @@@         @@@       @@           *@@      @@@       @@@(@@@@ @@%",
				"    @@              @@   @@@       @@@              @@    @@@       @@        @@@         @@@       @@            @@        @@%        #*    @@&",
				"    @@              @@    @@@      #@@@@@          @@@    *@@       @@        %@@@@@      @@@      .@@            @@         @@&             @@@    @@",
				"   /@@              @@     @@      ,@@             @@(     @@       @@        *@@         @@@      @@@            @@          @@             #@@    @@",
				"   @@@              @@     @@@      @@             @@      @@%      @@        .@@         @@@      @@             @@          @@@            ,@@    .",
				"   @@@             *@@     *@@      @@            @@@      %@@      @@         @@         @@@     @@@             @@.         @@@             @@   @@@",
				"   @@@             #@@      @@      @@            @@& .(%&&&@@      @@         @@         @@@    ,@@              @@.         @@@            .@@",
				"   @@@       @@@   &@@      @@*     @@           ,@@@@(,.   @@(     @@         @@         @@@    @@               @@/         @@    @@@@@@   ,@@",
				"   @@@       @@@   @@@      @@%     @@           @@#        @@@     @@         @@         @@@  ,@@                @@&        @@#   @@#  #    %@@",
				"   @@@       @@    @@@      @@&     @@          @@@          @@     @@         @@         @@% @@@                 @@@       @@(    @@/       @@%",
				"    @@      @@.    @@@      @@%    .@@          @@           @@     @@.       ,@@         @@*@@@                  @@@     @@@       @@(     @@@",
				"    ,@@@(@@@@      @@@      /@@    @@@@@@@@@   @@.           @@@    @@,       @@@@@@@@@   @@@@                    @@@@@@@@%          (@@@@@@@",
				"        ,.                                                                                @@@                                                  ",
				"                                                                                                                                                 ",
				"                                                                                                                                                   ",
				"                                                                     @@                           #@@@.              @@@@@                           ",
				" @@/@@@      .@    @@      ,@                  @@@@@@   ,@@@@@      @@@,      @. @@@@@@          @@                 %@  @@@       .@    @@      ,@",
				"    @.       @@    %@       @,                @@    @@   @*         @@@@      @&@@    @@        %@                  *@   (@       @@    &@       @*",
				"    @#       @@    .@       @&               &@          @#        *@  @*     @@@     @(         @@@@@               @ .@@        @@    ,@       @%",
				"    @@       @@     @,      @@                @@         @@        @@  @@     @@@     @           @@@@               @, @@@*      @@     @,      @@",
				"    #@       @@     @#      @@                 @@        @@        @@  @@     @@@    &@          @%                  @/    @@.    @@     @#      @@",
				"     @@      @@     @&      @@                  @@       @@@@      @    @.    @@#    @@         @@    .              @#      @#   @@     @%      @@",
				"     @@      @@     @@      @@                   #@(     @@       @@    @@    &@     @@         @,  @@@@@@%          @&      @@   @@     @&      @@",
				"      @.     &@     @%      @@                     @&    %@       @@    @@    %@     @@         @  @@@#   @@         @@       @,  @@     @%      @@",
				"      @%     #@     @#      @@                .@@  *@    ,@       @@@@@@@@    (@     @%         @.   .    #@         @@      /@   %@     @/      @@",
				"      @&     #@     @       @@                @(    @@    @      @@      @@   (@     @          @@        #@         @@      @@   %@     @       @@",
				" @/   @*     @@    %@       @/     &,         @@     @,  (@     *@       @@   %@    /@           @@       @&         @@     @@    @@    &@       @/",
				" @@  @@      @@    @@@@@@  &@@@@@  #@          @@@@@@@   @@@@@@ @@       %@   @@*   &@             @@@@@@@           @@&@@@@      @@    @@@@@@  &@@@@@",
				"  /@@@                             @.                                         %@                                                                      ",

				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", };

		for (int i = 0; i < importantInfo.length; i++) {
			// Pause for 4 seconds
			Thread.sleep(100);
			// Print a message
			System.out.println(importantInfo[i]);
		}

		clearScreen();

		System.out.println(
				"                                                                                                  /@");
		System.out.println(
				"   .@@@@@/                                              (@@@@                     @@@          @@@@@@@@");
		System.out.println(
				"   @@@@@@@@@@@                @@@@@(                   @@@@@@@           @@@      @@@         @@@#   @@@        @#          @@");
		System.out.println(
				"   @@@     *@@@@              @@@@@@@@@               @@@  @@@@          @@@      @@@        @@@@              @@@          @@@       @@         &@@@@");
		System.out.println(
				"   @@@*      @@@%             @@@@   @@@@            @@@@   @@@,         @@@      @@@       @@@@               @@@         @@@@      @@@@@@@@@@@@@@@@@");
		System.out.println(
				"   @@@%      @@@              @@@@    @@@,           @@@     @@@         @@@      @@@       @@@                @@@         @@@@            @@@@");
		System.out.println(
				"   @@@@    @@@@               @@@@    @@@,          @@@@     @@@@        @@@      @@@      @@@@                @@@         @@@@            @@@&");
		System.out.println(
				"   @@@@ @@@@@#                @@@&   @@@@           @@@       @@@        @@@      @@@      @@@&               %@@@         @@@@            @@@&");
		System.out.println(
				"   &@@@@@@@@@@@               @@@* &@@@@           @@@@       @@@#       @@@      @@@      @@@                @@@@         @@@@            @@@&");
		System.out.println(
				"   ,@@@     &@@@@@            @@@@@@@@             @@@        @@@@      ,@@@      @@@      @@@                @@@@         @@@@            @@@&");
		System.out.println(
				"    @@@        &@@@@          @@@@@@@@             @@@         @@@      &@@@      @@@      @@@                @@@@         @@@@            @@@&");
		System.out.println(
				"    @@@          #@@@         @@@   @@@@          *@@@         @@@      @@@@      @@@      @@@                @@@@          @@@            @@@&");
		System.out.println(
				"    @@@            @@@#       @@@     @@@         @@@@         @@@&     @@@@      @@@      @@@                @@@@#@@@@@@@@@@@@            @@@&");
		System.out.println(
				"    @@@             @@@       @@@      @@@        @@@/         @@@@     @@@@      @@@      @@@                @@@@@@@@@@@@@@@@@@           @@@&");
		System.out.println(
				"    @@@             .@@@     ,@@@      @@@@       @@@          %@@@     @@@@      @@@.     @@@    @@@@@@      (@@@          @@@            @@@&");
		System.out.println(
				"    @@@              @@@#    %@@@       @@@       @@@           @@@     @@@(      @@@*     @@@    *@@@@@*      @@@          @@@            @@@&");
		System.out.println(
				"    @@@              @@@@    @@@@       @@@&      @@@           @@@     @@@       @@@#     @@@       @@@@      @@@          @@@            @@@&");
		System.out.println(
				"    @@@.             @@@@    @@@@       %@@@      @@@           @@@     @@@       @@@%     @@@        @@@      @@@          @@@            @@@&");
		System.out.println(
				"    @@@%             @@@@    @@@@        @@@      @@@           @@@     @@@       @@@&     @@@,       @@@      @@@          @@@            @@@@");
		System.out.println(
				"    @@@@             @@@     @@@@        @@@      @@@(          @@@     @@@       @@@@     @@@&       @@@/     @@@.         @@@,           @@@@");
		System.out.println(
				"    @@@@            @@@@     @@@@        @@@@     @@@@         @@@@     @@@       @@@@     @@@@       @@@@     @@@&         @@@/           @@@@");
		System.out.println(
				"    @@@@           @@@@      @@@(        @@@@     /@@@         @@@      @@@       @@@@     @@@@       @@@@     @@@@         @@@&           @@@@");
		System.out.println(
				"    &@@@          @@@@       @@@         @@@@      @@@        @@@@      @@@@      @@@@     *@@@       @@@&     @@@@         @@@@           @@@@");
		System.out.println(
				"    *@@@         @@@@        @@@         @@@@      @@@       @@@@        @@@@     @@@       @@@       @@@      @@@@         @@@@           @@@@");
		System.out.println(
				"     @@@      @@@@@          @@@         @@@@      @@@@     @@@@          .@@@@  @@@@       @@@@     @@@@      @@@#         @@@@           @@@@");
		System.out.println(
				"     @@@@@@@@@@@             @@@@         @@@       @@@# @@@@@               @@@@@@          @@@@@&@@@@%                    ,@@@           &@@@");
		System.out.println(
				"      @                       @@           @@%       @@@@@@%                                    @@@@@                                            ");
		System.out.println(
				"                                                                                                                                                 ");
		System.out.println(
				"                                                                                                                                                  ");
		System.out.println(
				"                                                                                                                                                  ");
		System.out.println(
				"                                                                                                                                                  ");
		System.out.println(
				"                                                                                                                                                  ");
		System.out.println(
				"                      @@@*                               @@@         @@@                 @@@               (@@@                              @@");
		System.out.println(
				"                    @@@@@@,                   @@/        @@@       @@@@@@         @@@    @@@               @@@@@@@@@             @@@        @@@");
		System.out.println(
				" @@  #@@@@@@@@@    (@@  @@@                  @@@        @@@       @@@  @@@        @@@    @@@               @@@    (@@@           @@&        @@@");
		System.out.println(
				" (@@@@@@&          @@@   @@@                 @@@       %@@@      @@@   &@@        @@@    @@@               @@@     @@@          %@@        @@@@");
		System.out.println(
				"     ,@@          @@@     @@@                @@@       @@@@      @@@    @@@       @@@    @@@               @@@    @@@#          @@@       @@@@");
		System.out.println(
				"     (@@          @@@     @@@                @@@      @@@@@     @@@      @@*      @@@    @@@               @@@ %@@@@            @@@      @@@@@");
		System.out.println(
				"     (@@          @@(      @@,               @@@     @@@@@@     @@@      @@@      @@@    (@@               @@@@@@@@@@           @@@     @@@@@@");
		System.out.println(
				"     %@@         @@@       @@@               @@@   .@@@ @@@     @@@      @@@      @@#    *@@               @@@     %@@@@         @@&   @@@ @@@");
		System.out.println(
				"     %@@         @@@       @@@                @@@@@@@   @@@    %@@        @@.     @@     .@@               @@@        @@@#        @@@@@@@  @@@");
		System.out.println(
				"     %@@         @@@       @@@                          @@@    @@@        @@@    ,@@      @@               @@@          @@@                &@@");
		System.out.println(
				"     %@@         @@,        @@                          @@@    @@@        @@@    @@@      @@               *@@           @@@               .@@    @@@@");
		System.out.println(
				"     %@@        .@@         @@&                         @@@    @@@        @@@    @@@      @@.               @@           (@@                @@        ");
		System.out.println(
				"     %@@        (@@         @@@                         @@@    @@@        @@@    @@@      @@/               @@,           @@@               @@,       ");
		System.out.println(
				"     (@@        (@@         @@@                         %@@    @@@        @@@    @@@      @@#               @@#           @@@               @@@   @@@@");
		System.out.println(
				"     (@@        ,@@         @@@                         %@@    @@@        @@@    @@@      @@%               @@@           @@@               @@@");
		System.out.println(
				"     ,@@         @@.        @@@                @@@      @@@    @@@        @@@    @@@      @@@               @@@           @@@     @@@@      @@@");
		System.out.println(
				"      @@         @@@        @@,              @@# @@@    @@@    @@@        @@@    @@@      @@@               @@@          @@@    @@@/#@@@    @@&");
		System.out.println(
				"      @@         @@@       @@@              @@@         @@@    @@@        @@.    @@@      @@@               @@@         @@@     @@          @@");
		System.out.println(
				"      @@         @@@      @@@               @@@         @@@     @@.      @@@      @@@     @@%               @@@        @@@      @@*        @@@");
		System.out.println(
				"      @@         #@@     @@@                 @@@      @@@@      @@@     @@@        @@@.  @@@                @@@      @@@@       @@@#      @@@");
		System.out.println(
				"      @@*         @@@  @@@@                   ,@@@@@@@@@        @@@  @@@@            @@@@@@                 @@@@@@@@@@            @@@@@@@@@");
		System.out.println(
				"                   @@@@@                                         .@@@@@                                      %                               ");
		System.out.println(" ");

		System.out.println("                                                   Press enter to continue.");
		String pressEnter = keyboard.nextLine();

		clearScreen();

		System.out.println(
				"                                                                                                                        @");
		System.out.println(
				"                                                                                                                      @@@@");
		System.out.println(
				"                                                                                                                      .@@@");
		System.out.println(
				"@@@@@@@@@@@@/                           %%%%%          @@@@@                    @@@@@    @@@@@@@@@@@@@@@@@@@@@*        @@@            @@@@@@@@@@");
		System.out.println(
				"@@@@@@@@@@@@@@@@@@                     @@@@@@@          @@@@@                  @@@@@     @@@@@@@@@@@@@@@@@@@@@*        @@         @@@@@@@@@@@@@@@@@@");
		System.out.println(
				"@@@@@      @@@@@@@@@@                 @@@@@@@@@          @@@@@                @@@@@      @@@@@                                  @@@@@@@       /@@@@@@/");
		System.out.println(
				"@@@@@           @@@@@@               @@@@@ @@@@@          @@@@@              @@@@@       @@@@@                                  @@@@@             @&");
		System.out.println(
				"@@@@@             @@@@@#            @@@@@  #@@@@(         *@@@@@            @@@@@        @@@@@                                  @@@@@               ");
		System.out.println(
				"@@@@@              @@@@@           @@@@@    @@@@@*         @@@@@%          @@@@@         @@@@@                                   @@@@@@@             ");
		System.out.println(
				"@@@@@               @@@@          @@@@@      @@@@@          @@@@@/        @@@@@          @@@@@@@@@@@@@@@@@@@@                     &@@@@@@@@@@@@      ");
		System.out.println(
				"@@@@@               @@@@         @@@@@        @@@@@          @@@@@       @@@@@,          @@@@@@@@@@@@@@@@@@@@                          @@@@@@@@@@@@  ");
		System.out.println(
				"@@@@@              (@@@@        @@@@@          @@@@@          @@@@@     &@@@@#           @@@@@                                                @@@@@@@");
		System.out.println(
				"@@@@@              @@@@@       @@@@@@@@@@@@@@@@@@@@@@          @@@@@    @@@@@            @@@@@                                                   @@@@@");
		System.out.println(
				"@@@@@            @@@@@@       @@@@@@@@@@@@@@@@@@@@@@@@          @@@@@  @@@@@             @@@@@                                   @                @@@@");
		System.out.println(
				"@@@@@        @@@@@@@@        @@@@@                @@@@@          @@@@@@@@@@              @@@@@                                 @@@@@@            @@@@@");
		System.out.println(
				"@@@@@@@@@@@@@@@@@@@         @@@@@                  @@@@@          @@@@@@@@               @@@@@@@@@@@@@@@@@@@@@*                 @@@@@@@@@@@@@@@@@@@@@");
		System.out.println(
				"@@@@@@@@@@@@@@@            @@@@@                    @@@@@          @@@@@@                @@@@@@@@@@@@@@@@@@@@@*                    @@@@@@@@@@@@@@@& ");
		System.out.println(
				"                                                                                                                                                     ");
		System.out.println(
				"                                                                                                                                                    ");
		System.out.println(
				"                                                                                                                                                    ");
		System.out.println(
				"                                                                                                                                                     ");
		System.out.println(
				"       @@@@@@@#                                &@@@&                 (@@@@@@(                @@@@@@@@@@@@@@@@@@@@@@            (@@@@@@@@@            ");
		System.out.println(
				"       @@@@@@@@@@@@@@@                   &@@@@@@@@@@@@@@@.           (@@@@@@@@@@@@.          @@@@@@@@@@@@@@@@@@@@@@        .@@@@@@@@@@@@@@@@@        ");
		System.out.println(
				"       @@@@@@@@@@@@@@@@@@              @@@@@@@@@@#@@@@@@@@@@         (@@@@#@@@@@@@@@@        @@@@@@@@@@@@@@@@@@@@@@       @@@@@@@      @@@@@@@@     ");
		System.out.println(
				"       @@@@%        #@@@@@           @@@@@@             @@@@@@       (@@@@      ,@@@@@#      @@@@@                       @@@@@             @@       ");
		System.out.println(
				"       @@@@%          @@@@@         @@@@@                 @@@@@      (@@@@        @@@@@      @@@@@                       @@@@@                      ");
		System.out.println(
				"       @@@@%          @@@@@        @@@@@                   @@@@@     (@@@@         @@@@@     @@@@@                        @@@@@@@                    ");
		System.out.println(
				"       @@@@%         @@@@@         @@@@@                   #@@@@     (@@@@        .@@@@      @@@@@@@@@@@@@@@@@@@@          .@@@@@@@@@@@@            ");
		System.out.println(
				"       @@@@%     @@@@@@@@          @@@@                     @@@@     (@@@@       @@@@@@      @@@@@@@@@@@@@@@@@@@@              (@@@@@@@@@@@@        ");
		System.out.println(
				"       @@@@@@@@@@@@@@@@            @@@@@                   @@@@@     (@@@@   @@@@@@@@        @@@@@                                     @@@@@@@/     ");
		System.out.println(
				"       @@@@@@@@@@@@@@@             &@@@@                   @@@@@     (@@@@@@@@@@@@@          @@@@@                                        @@@@@@    ");
		System.out.println(
				"       @@@@%      @@@@@@            @@@@@@               @@@@@@      (@@@@@@@@               @@@@@                        @                @@@@@");
		System.out.println(
				"       @@@@%        @@@@@@            @@@@@@           @@@@@@        (@@@@                   @@@@@                      @@@@@@            @@@@@");
		System.out.println(
				"       @@@@%          @@@@@@           /@@@@@@@@@@@@@@@@@@@          (@@@@                   @@@@@@@@@@@@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@@ ");
		System.out.println(
				"       @@@@%            @@@@@@            #@@@@@@@@@@@@@.            (@@@@                   @@@@@@@@@@@@@@@@@@@@@@         @@@@@@@@@@@@@@@@    ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("                                                   Press enter to continue.");
		pressEnter = keyboard.nextLine();

		clearScreen();

		System.out.println(
				"                                                    @@@@                                         @@@@@&");
		System.out.println(
				"                                                   @@@@@@               @%       *@@@@@@&         @@@@@@@@@");
		System.out.println(
				"                                                   @@@@@@@             @@@*   .@@@@@@@@@@@@       @@@@  @@@@@@");
		System.out.println(
				"                                                  @@@@,@@@             @@@@  @@@@       @@@@      @@@@     @@@@@");
		System.out.println(
				"                                                  @@@@ @@@@            @@@@ @@@@        (@@@      ,@@@       @@@@&");
		System.out.println(
				"                                                  @@@  /@@@            @@@@@@@@         &@@@       @@@         @@@@ ");
		System.out.println(
				"                                                 @@@@   @@@@           /@@@@@@(         @@@@       @@@&         @@@@  ");
		System.out.println(
				"                                                 @@@@   @@@@            @@@@@@          @@@@       @@@@         /@@@");
		System.out.println(
				"                                                 @@@    .@@@            @@@@@@          @@@@       @@@@          @@@@");
		System.out.println(
				"                                                #@@@     @@@@           @@@@@&          @@@,       @@@@          @@@@ ");
		System.out.println(
				"                                                @@@@     @@@@           @@@@@           @@@        @@@@          %@@@");
		System.out.println(
				"                                                @@@,      @@@           @@@@@          &@@@        @@@@          (@@@");
		System.out.println(
				"                                                @@@       @@@%          @@@@@          @@@@        @@@@          @@@@");
		System.out.println(
				"                                               @@@@       @@@@          @@@@@          @@@@        @@@@          @@@@");
		System.out.println(
				"                                               @@@@        @@@          @@@@@          @@@@        &@@@          @@@@");
		System.out.println(
				"                                               @@@         @@@.         #@@@@          @@@(        &@@@         ,@@@");
		System.out.println(
				"                                              @@@@         @@@@         (@@@(          @@@         @@@@         @@@@");
		System.out.println(
				"                                              @@@@         /@@@         *@@@,         ,@@@         @@@@        #@@@");
		System.out.println(
				"                                             .@@@           @@@         ,@@@          @@@@         @@@@        @@@%");
		System.out.println(
				"                                             @@@@@@@@@@@@@@@@@@@        .@@@          @@@@         @@@@       @@@@");
		System.out.println(
				"                                             @@@@@@@@@@&%###@@@@        .@@@          @@@@         @@@@      @@@@");
		System.out.println(
				"                                            @@@@             @@@        .@@@          @@@&         @@@@     @@@@");
		System.out.println(
				"                                            @@@              @@@@       .@@@,         @@@.         @@@@    @@@@");
		System.out.println(
				"                                           @@@@              @@@@       *@@@#         @@@          @@@@   @@@@");
		System.out.println(
				"                                          @@@@               ,@@@       #@@@@        *@@@          @@@@ @@@@");
		System.out.println(
				"                                         &@@@                 @@@(      @@@@@        @@@@          @@@@@@@@");
		System.out.println(
				"                                         @@@#                 @@@@      @@@@@        @@@@          @@@@@@");
		System.out.println(
				"                                          %                    @@%      @@@@                       @@@@@");
		System.out.println(
				"                                                                                                    @@");
		System.out.println("                                         ");

		System.out.println("                                                   Press enter to continue.");
		pressEnter = keyboard.nextLine();

		clearScreen();

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"                                                                                                                       @");
		System.out.println(
				"                                                                                                                      @@@@ ");
		System.out.println(
				"                                                                                                                      @@@@");
		System.out.println(
				"#####              /######  ######                    ######  @@@@@                     @@@@@@@@@@@@@@@@@@@@@@        @@@             @@@@@@@@@% ");
		System.out.println(
				"@@@@@            @@@@@@@      @@@@@@                @@@@@@    @@@@@                     @@@@@@@@@@@@@@@@@@@@@@        %@          @@@@@@@@@@@@@@@@@@");
		System.out.println(
				"@@@@@          @@@@@@@          @@@@@@            /@@@@@(     @@@@@                     @@@@@@@@@@@@@@@@@@@@@@                  @@@@@@@       @@@@@@@@");
		System.out.println(
				"@@@@@        @@@@@@*             @@@@@@          @@@@@@       @@@@@                     @@@@@                                  @@@@@              @@");
		System.out.println(
				"@@@@@     /@@@@@@                  @@@@@@      @@@@@@         @@@@@                     @@@@@                                  @@@@@                ");
		System.out.println(
				"@@@@@   @@@@@@@                      @@@@@@  &@@@@@*          @@@@@                     @@@@@                                   @@@@@@@              ");
		System.out.println(
				"@@@@@ @@@@@@@                         @@@@@@@@@@@@            @@@@@                     @@@@@@@@@@@@@@@@@@@@                      @@@@@@@@@@@@.      ");
		System.out.println(
				"@@@@@@@@@@@@                            @@@@@@@@              @@@@@                     @@@@@@@@@@@@@@@@@@@@                         (@@@@@@@@@@@@@");
		System.out.println(
				"@@@@@@@@@@@@@@                            @@@@@               @@@@@                     @@@@@                                                @@@@@@@@");
		System.out.println(
				"@@@@@@    @@@@@@@                         @@@@#               @@@@@                     @@@@@                                                    @@@@@");
		System.out.println(
				"@@@@@       @@@@@@@                       @@@@#               @@@@@                     @@@@@                                                     @@@@");
		System.out.println(
				"@@@@@          @@@@@@@                    @@@@#               @@@@@                     @@@@@                                  @@@@@             @@@@@");
		System.out.println(
				"@@@@@            @@@@@@@                  @@@@#               @@@@@@@@@@@@@@@@@@@       @@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@@@@&..@@@@@@@@@");
		System.out.println(
				"@@@@@              @@@@@@@                @@@@#               @@@@@@@@@@@@@@@@@@@       @@@@@@@@@@@@@@@@@@@@@@                    @@@@@@@@@@@@@@@@@");
		System.out.println(
				"                                                                                                                                       ,@@@@@@");
		System.out.println(
				"                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                ");
		System.out.println(
				"                                                      @@@@@@*                                  ,,,,,,,,,,,,,,,,                           @@@@@@,");
		System.out.println(
				"  @@@@        @@@@@             @@@@@@            %@@@@@@@@@@@@@       @@@         @@@@%       @@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@");
		System.out.println(
				"  @@@@      @@@@@              @@@@@@@@          @@@@         @@       @@@      @@@@@          @@@                      (@@@         @@@@         @@");
		System.out.println(
				"  @@@@   *@@@@                %@@@  @@@@         @@@@                  @@@    @@@@@            @@@                      (@@@         @@@@");
		System.out.println(
				"  @@@@ @@@@@                 ,@@@    @@@@         @@@@@@#              @@@  @@@@@              @@@                      (@@@          @@@@@@/");
		System.out.println(
				"  @@@@@@@@                  .@@@      @@@@          &@@@@@@@@@,        @@@@@@@@                @@@@@@@@@@@@@@           (@@@            @@@@@@@@@@");
		System.out.println(
				"  @@@@@@@@@@                @@@        @@@@                @@@@@@      @@@@@@@@@@              @@@                      (@@@                   @@@@@@");
		System.out.println(
				"  @@@@    @@@@@            @@@@@@@@@@@@@@@@@                  @@@@     @@@    @@@@@.           @@@                      (@@@                      @@@@");
		System.out.println(
				"  @@@@      @@@@@         @@@,           @@@@    @@@          @@@@     @@@       @@@@@         @@@                      (@@@         @@@          @@@@");
		System.out.println(
				"  @@@@        @@@@@#     @@@(             @@@#   @@@@@@@@@@@@@@@@      @@@         @@@@@       @@@@@@@@@@@@@@@@         (@@@         @@@@@@@@@@@@@@@@");
		System.out.println(
				"  @@@@           @@@@@  @@@%               @@@,     /@@@@@@@@@         @@@           (@@@@@    @@@@@@@@@@@@@@@@         (@@@            #@@@@@@@@@");
		System.out.println(" ");

		System.out.println("                                                   Press enter to continue.");
		pressEnter = keyboard.nextLine();

		clearScreen();

	}

	public static void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

}
