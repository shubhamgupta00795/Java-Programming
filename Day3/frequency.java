import java.util.*;
class frequency{
    public static ArrayList<Integer> samFun(ArrayList<Integer> arr){
        ArrayList<Integer> sample=new ArrayList<>(); 
        for(int i=0;i<arr.size();i++){
            int count=0;
            for(int j=0;j<arr.size();j++){
                if(arr.get(i)==arr.get(j)){
                    count++;
                }
            }
            sample.add(count);
        }
        return sample;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(52);arr.add(64);arr.add(269);arr.add(277);arr.add(369);arr.add(295);arr.add(660);arr.add(505);arr.add(358);arr.add(507);arr.add(653);arr.add(520);arr.add(758);arr.add(954);arr.add(695);arr.add(756);arr.add(100);arr.add(819);arr.add(707);arr.add(469);arr.add(159);arr.add(936);arr.add(359);arr.add(187);arr.add(161);arr.add(670);arr.add(750);arr.add(916);arr.add(39);arr.add(188);arr.add(742);arr.add(90);arr.add(251);arr.add(362);arr.add(718);arr.add(972);arr.add(9);arr.add(378);arr.add(476);arr.add(718);arr.add(236);arr.add(128);arr.add(237);arr.add(346);arr.add(433);arr.add(284);arr.add(101);arr.add(884);arr.add(102);arr.add(159);arr.add(705);arr.add(261);arr.add(95);arr.add(415);arr.add(799);arr.add(255);arr.add(84);arr.add(900);arr.add(170);arr.add(474);arr.add(88);arr.add(263);arr.add(563);arr.add(690);arr.add(977);arr.add(632);arr.add(661);arr.add(985);arr.add(361);arr.add(489);arr.add(702);arr.add(597);arr.add(968);arr.add(290);arr.add(942);arr.add(401);arr.add(573);arr.add(394);arr.add(636);arr.add(675);arr.add(553);arr.add(340);arr.add(287);arr.add(999);arr.add(754);arr.add(437);arr.add(253);arr.add(189);arr.add(337);arr.add(774);arr.add(662);arr.add(776);arr.add(388);arr.add(576);arr.add(817);arr.add(364);arr.add(208);arr.add(478);arr.add(700);arr.add(920);arr.add(966);arr.add(753);arr.add(516);arr.add(933);arr.add(43);arr.add(809);arr.add(685);arr.add(615);arr.add(203);arr.add(321);arr.add(641);arr.add(107);arr.add(12);arr.add(279);arr.add(105);arr.add(118);arr.add(716);arr.add(709);arr.add(306);arr.add(404);arr.add(834);arr.add(968);arr.add(179);arr.add(221);arr.add(543);arr.add(995);arr.add(937);arr.add(102);arr.add(824);arr.add(636);arr.add(22);arr.add(141);arr.add(389);arr.add(889);arr.add(74);arr.add(783);arr.add(698);arr.add(110);arr.add(397);arr.add(252);arr.add(782);arr.add(38);arr.add(710);arr.add(794);arr.add(316);arr.add(166);arr.add(263);arr.add(383);arr.add(874);arr.add(568);arr.add(786);arr.add(707);arr.add(887);arr.add(316);arr.add(279);arr.add(430);arr.add(663);arr.add(215);arr.add(531);arr.add(838);arr.add(203);arr.add(904);arr.add(979);arr.add(943);arr.add(793);arr.add(52);arr.add(725);arr.add(842);arr.add(513);arr.add(121);arr.add(445);arr.add(295);arr.add(510);arr.add(154);arr.add(440);arr.add(178);arr.add(319);arr.add(702);arr.add(560);arr.add(192);arr.add(621);arr.add(698);arr.add(250);arr.add(508);arr.add(365);arr.add(528);arr.add(289);arr.add(27);arr.add(95);arr.add(171);arr.add(865);arr.add(649);arr.add(75);arr.add(195);arr.add(591);arr.add(219);arr.add(246);arr.add(667);arr.add(60);arr.add(110);arr.add(787);arr.add(856);arr.add(404);arr.add(649);arr.add(9);arr.add(195);arr.add(826);arr.add(327);arr.add(896);arr.add(737);arr.add(870);arr.add(869);arr.add(786);arr.add(471);arr.add(728);arr.add(151);arr.add(350);arr.add(16);arr.add(529);arr.add(444);arr.add(186);arr.add(745);arr.add(444);arr.add(612);arr.add(939);arr.add(34);arr.add(182);arr.add(184);arr.add(700);arr.add(241);arr.add(294);arr.add(839);arr.add(448);arr.add(49);arr.add(839);arr.add(456);arr.add(244);arr.add(16);arr.add(134);arr.add(491);arr.add(752);arr.add(355);arr.add(359);arr.add(538);arr.add(825);arr.add(86);arr.add(40);arr.add(527);arr.add(453);arr.add(568);arr.add(322);arr.add(991);arr.add(313);arr.add(766);arr.add(602);arr.add(251);arr.add(799);arr.add(136);arr.add(787);arr.add(851);arr.add(728);arr.add(432);arr.add(41);arr.add(176);arr.add(832);arr.add(879);arr.add(631);arr.add(75);arr.add(894);arr.add(765);arr.add(918);arr.add(997);arr.add(471);arr.add(628);arr.add(534);arr.add(296);arr.add(66);arr.add(925);arr.add(174);arr.add(518);arr.add(493);arr.add(495);arr.add(508);arr.add(157);arr.add(260);arr.add(462);arr.add(759);arr.add(411);arr.add(597);arr.add(545);arr.add(261);arr.add(324);arr.add(328);arr.add(301);arr.add(499);arr.add(160);arr.add(531);arr.add(482);arr.add(586);arr.add(424);arr.add(598);arr.add(503);arr.add(420);arr.add(68);arr.add(131);arr.add(306);arr.add(715);arr.add(196);arr.add(230);arr.add(888);arr.add(65);arr.add(74);arr.add(383);arr.add(925);arr.add(230);arr.add(642);arr.add(386);arr.add(989);arr.add(52);arr.add(334);arr.add(885);arr.add(664);arr.add(9);arr.add(213);arr.add(316);arr.add(860);arr.add(724);arr.add(846);arr.add(341);arr.add(661);arr.add(269);arr.add(290);arr.add(164);arr.add(41);arr.add(357);arr.add(646);arr.add(346);arr.add(424);arr.add(193);arr.add(927);arr.add(311);arr.add(609);arr.add(1);arr.add(45);arr.add(533);arr.add(582);arr.add(39);arr.add(270);arr.add(570);arr.add(90);arr.add(955);arr.add(807);arr.add(106);arr.add(964);arr.add(371);arr.add(421);arr.add(823);arr.add(94);arr.add(619);arr.add(515);arr.add(754);arr.add(239);arr.add(804);arr.add(269);arr.add(279);arr.add(512);arr.add(266);arr.add(976);arr.add(935);arr.add(458);arr.add(903);arr.add(246);arr.add(419);arr.add(255);arr.add(642);arr.add(951);arr.add(836);arr.add(680);arr.add(221);arr.add(758);arr.add(122);arr.add(175);arr.add(564);arr.add(227);arr.add(490);arr.add(934);arr.add(999);arr.add(664);arr.add(379);arr.add(617);arr.add(178);arr.add(484);arr.add(856);arr.add(333);arr.add(105);arr.add(486);arr.add(845);arr.add(370);arr.add(462);arr.add(779);arr.add(180);arr.add(364);arr.add(376);arr.add(598);arr.add(618);arr.add(18);arr.add(548);arr.add(805);arr.add(697);arr.add(120);arr.add(562);arr.add(818);arr.add(295);arr.add(125);arr.add(396);arr.add(136);arr.add(410);arr.add(395);arr.add(800);arr.add(788);arr.add(363);arr.add(977);arr.add(624);arr.add(570);arr.add(662);arr.add(728);arr.add(56);arr.add(506);arr.add(97);arr.add(517);arr.add(636);arr.add(276);arr.add(232);arr.add(364);arr.add(225);arr.add(201);arr.add(381);arr.add(125);arr.add(5);arr.add(429);arr.add(244);arr.add(567);arr.add(599);arr.add(890);arr.add(43);arr.add(994);arr.add(26);arr.add(453);arr.add(740);arr.add(825);arr.add(592);arr.add(103);arr.add(153);arr.add(215);arr.add(24);arr.add(814);arr.add(942);arr.add(79);arr.add(671);arr.add(391);arr.add(947);arr.add(659);arr.add(18);arr.add(178);arr.add(22);arr.add(243);arr.add(378);arr.add(402);arr.add(367);arr.add(383);arr.add(182);arr.add(962);arr.add(301);arr.add(780);arr.add(852);arr.add(343);arr.add(126);arr.add(229);arr.add(147);arr.add(865);arr.add(405);arr.add(91);arr.add(319);arr.add(909);arr.add(305);arr.add(343);arr.add(75);arr.add(599);arr.add(773);arr.add(745);arr.add(989);arr.add(720);arr.add(403);arr.add(358);arr.add(897);arr.add(424);arr.add(600);arr.add(627);arr.add(177);arr.add(318);arr.add(361);arr.add(359);arr.add(280);arr.add(13);arr.add(490);arr.add(483);arr.add(355);arr.add(615);arr.add(63);arr.add(854);arr.add(480);arr.add(467);arr.add(944);arr.add(150);arr.add(375);arr.add(600);arr.add(492);arr.add(449);arr.add(550);arr.add(265);arr.add(546);arr.add(538);arr.add(336);arr.add(948);arr.add(896);arr.add(584);arr.add(724);arr.add(847);arr.add(210);arr.add(252);arr.add(517);arr.add(922);arr.add(610);arr.add(796);arr.add(934);arr.add(100);arr.add(630);arr.add(641);arr.add(714);arr.add(692);arr.add(494);arr.add(545);arr.add(510);arr.add(789);arr.add(695);arr.add(884);arr.add(740);arr.add(538);arr.add(685);arr.add(290);arr.add(154);arr.add(230);arr.add(179);arr.add(489);arr.add(529);arr.add(426);arr.add(73);arr.add(604);arr.add(273);arr.add(634);arr.add(856);arr.add(789);arr.add(556);arr.add(817);arr.add(936);arr.add(841);arr.add(268);arr.add(917);arr.add(481);arr.add(334);arr.add(608);arr.add(326);arr.add(230);arr.add(117);arr.add(114);arr.add(924);arr.add(352);arr.add(206);arr.add(814);arr.add(388);arr.add(495);arr.add(967);arr.add(969);arr.add(673);arr.add(456);arr.add(850);arr.add(99);arr.add(880);arr.add(453);arr.add(723);arr.add(865);arr.add(660);arr.add(863);arr.add(420);arr.add(829);arr.add(150);arr.add(261);arr.add(96);arr.add(66);arr.add(93);arr.add(781);arr.add(25);arr.add(419);arr.add(11);arr.add(141);arr.add(884);arr.add(934);arr.add(844);arr.add(89);arr.add(747);arr.add(232);arr.add(583);arr.add(66);arr.add(200);arr.add(608);arr.add(521);arr.add(401);arr.add(58);arr.add(752);arr.add(854);arr.add(132);arr.add(616);arr.add(865);arr.add(994);arr.add(388);arr.add(693);arr.add(143);arr.add(1000);arr.add(789);arr.add(560);arr.add(92);arr.add(569);arr.add(584);arr.add(510);arr.add(579);arr.add(76);arr.add(394);arr.add(865);arr.add(919);arr.add(834);arr.add(963);arr.add(502);arr.add(417);arr.add(28);arr.add(54);arr.add(24);arr.add(900);arr.add(454);arr.add(433);arr.add(3);arr.add(659);arr.add(564);arr.add(619);arr.add(524);arr.add(557);arr.add(358);arr.add(216);arr.add(51);arr.add(357);arr.add(356);arr.add(962);arr.add(800);arr.add(925);arr.add(545);arr.add(662);arr.add(855);arr.add(620);arr.add(407);arr.add(71);arr.add(890);arr.add(240);arr.add(34);arr.add(744);arr.add(656);arr.add(413);arr.add(149);arr.add(31);arr.add(313);arr.add(602);arr.add(463);arr.add(315);arr.add(613);arr.add(378);arr.add(285);arr.add(136);arr.add(934);arr.add(642);arr.add(703);arr.add(336);arr.add(350);arr.add(59);arr.add(297);arr.add(150);arr.add(335);arr.add(193);arr.add(811);arr.add(189);arr.add(164);arr.add(569);arr.add(260);arr.add(406);arr.add(808);arr.add(645);arr.add(149);arr.add(816);arr.add(57);arr.add(297);arr.add(198);arr.add(721);arr.add(250);arr.add(13);arr.add(388);arr.add(862);arr.add(390);arr.add(672);arr.add(349);arr.add(676);arr.add(666);arr.add(52);arr.add(11);arr.add(15);arr.add(462);arr.add(660);arr.add(516);arr.add(796);arr.add(852);arr.add(678);arr.add(336);arr.add(368);arr.add(246);arr.add(947);arr.add(773);arr.add(54);arr.add(591);arr.add(921);arr.add(221);arr.add(1000);arr.add(569);arr.add(418);arr.add(720);arr.add(170);arr.add(430);arr.add(107);arr.add(32);arr.add(172);arr.add(131);arr.add(732);arr.add(847);arr.add(796);arr.add(135);arr.add(209);arr.add(810);arr.add(596);arr.add(868);arr.add(678);arr.add(391);arr.add(72);arr.add(355);arr.add(727);arr.add(791);arr.add(601);arr.add(673);arr.add(563);arr.add(6);arr.add(616);arr.add(835);arr.add(578);arr.add(967);arr.add(403);arr.add(995);arr.add(686);arr.add(572);arr.add(777);arr.add(145);arr.add(955);arr.add(300);arr.add(627);arr.add(39);arr.add(146);arr.add(422);arr.add(173);arr.add(354);arr.add(583);arr.add(769);arr.add(574);arr.add(260);arr.add(511);arr.add(997);arr.add(967);arr.add(589);arr.add(139);arr.add(567);arr.add(614);arr.add(701);arr.add(924);arr.add(229);arr.add(535);arr.add(501);arr.add(547);arr.add(289);arr.add(847);arr.add(584);arr.add(860);arr.add(623);arr.add(728);arr.add(167);arr.add(274);arr.add(706);arr.add(205);arr.add(419);arr.add(127);arr.add(729);arr.add(125);arr.add(62);arr.add(849);arr.add(50);arr.add(673);arr.add(712);arr.add(398);arr.add(639);arr.add(300);arr.add(536);arr.add(557);arr.add(913);arr.add(236);arr.add(480);arr.add(493);
        // System.out.print(samFun(arr)); 
        ArrayList<Integer> sample=new ArrayList<>(); 
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"<----------------->");
            int count=0;
            for(int j=0;j<arr.size();j++){
                if(arr.get(i)==arr.get(j)){
                    count++;
                }
            }
            System.out.println(count);
            sample.add(count);
        }
        System.out.print(arr.size());      
    }
}