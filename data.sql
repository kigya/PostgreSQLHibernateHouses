--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.10
-- Dumped by pg_dump version 9.6.10

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: _mytable; Type: TABLE; Schema: public; Owner: rebasedata
--

CREATE TABLE public._mytable (
    id integer,
    number smallint,
    area numeric(5,2) DEFAULT NULL::numeric,
    floors smallint,
    rooms character varying(2) DEFAULT NULL::character varying,
    street character varying(26) DEFAULT NULL::character varying,
    service_life smallint,
    type character varying(39) DEFAULT NULL::character varying
);


ALTER TABLE public._mytable OWNER TO rebasedata;

--
-- Data for Name: _mytable; Type: TABLE DATA; Schema: public; Owner: rebasedata
--

COPY public._mytable (id, number, area, floors, rooms, street, service_life, type) FROM stdin;
465620	201	405.78	26	7	74 Manufacturers Center	63	Exterior Signage
855932	23	61.90	9	6	4311 East Lane	51	Glass & Glazing
1523602	191	313.98	13		7 Pepper Wood Junction	58	RF Shielding
5134059	256	29.61	21	2	8 Paget Way	96	Casework
5161742	101	73.68	25	5	1 Truax Park	92	EIFS
7081537	223	414.39	28	4	76 Summerview Street	99	Granite Surfaces
8966213	45	50.13	29	5	01409 Farwell Road	50	Masonry & Precast
10009794	22	321.12	29		54445 Forest Dale Street	55	Overhead Doors
10120053	90	394.01	13	9	9826 Drewry Street	65	Rebar & Wire Mesh Install
10130983	191	211.64	4		38522 Spaight Place	75	Roofing (Asphalt)
10577228	291	323.10	10	4	560 Forest Pass	53	Asphalt Paving
11075767	124	478.30	29	3	5 Darwin Trail	57	RF Shielding
11466435	128	89.86	19	6	1 Sage Circle	71	Termite Control
12751320	140	350.94	18	8	02 Nobel Junction	86	Masonry & Precast
12954545	69	263.49	26	5	4269 Dovetail Terrace	69	Casework
13407346	119	112.93	3		78195 Jenifer Junction	50	Roofing (Asphalt)
13968220	190	73.96	27	7	43 Laurel Alley	85	Framing (Steel)
14906683	72	23.12	30	6	9596 Park Meadow Crossing	65	RF Shielding
18143539	142	365.83	8		67 Cardinal Crossing	59	Soft Flooring and Base
19372851	295	73.33	12		92 Springs Parkway	60	Doors, Frames & Hardware
21054950	299	277.94	13		0 Kenwood Court	83	Masonry
22584595	235	67.03	27	1	2 Anderson Terrace	62	RF Shielding
23350250	231	317.33	7	8	38020 East Alley	54	Curb & Gutter
23629609	26	344.46	12		39 Esch Drive	78	HVAC
24078287	32	327.65	11	10	28643 Homewood Street	67	Fire Protection
25408959	228	318.07	22		779 Sutteridge Circle	72	HVAC
25967600	147	402.49	20	9	0 Kinsman Junction	53	Overhead Doors
30871282	97	427.52	5		0 Morning Circle	74	RF Shielding
31798399	39	49.13	14	10	72 Lillian Road	59	Construction Clean and Final Clean
32029427	244	377.20	1	7	3916 Scofield Way	79	Casework
34170774	259	306.81	3	6	941 Pleasure Junction	81	Plumbing & Medical Gas
34272617	197	28.65	26		960 Hansons Parkway	91	Structural & Misc Steel Erection
34304532	157	474.52	2	4	3916 Sunfield Pass	96	Roofing (Asphalt)
34769360	62	160.97	13		5832 Oakridge Avenue	56	Glass & Glazing
35115592	137	381.92	16	9	25 Fordem Junction	98	Elevator
37275003	190	385.06	3		6344 Barnett Drive	82	Structural and Misc Steel (Fabrication)
37976752	120	17.33	10	10	2 Morning Plaza	51	Framing (Steel)
39124462	189	163.52	1	2	4 Drewry Road	90	Soft Flooring and Base
40404968	158	421.56	19	3	830 Sycamore Place	82	Masonry
40510809	272	167.77	6	6	2 Mendota Terrace	71	Masonry & Precast
40774359	56	143.16	10	7	33887 Nancy Hill	97	Soft Flooring and Base
41579528	21	74.69	11		41640 Iowa Lane	54	Framing (Wood)
41632747	215	114.44	15		1 Hayes Plaza	91	Termite Control
43595648	14	303.36	26	6	20 Maple Pass	74	Masonry & Precast
46563703	219	368.42	26	6	50 Wayridge Avenue	78	EIFS
47544037	198	414.31	29		94 Valley Edge Avenue	91	Retaining Wall and Brick Pavers
48551190	92	192.60	14	9	0395 Swallow Alley	54	Wall Protection
48968262	199	221.47	29	1	50259 Hooker Junction	84	Retaining Wall and Brick Pavers
49731757	81	146.18	8	7	70169 Bluestem Hill	56	Roofing (Asphalt)
51355992	159	222.74	5	5	564 Hermina Plaza	85	Electrical and Fire Alarm
52972755	33	362.95	26	8	800 Harper Plaza	63	Exterior Signage
53751414	259	126.00	27	9	79 Summerview Trail	99	Termite Control
54557968	139	139.30	15		10 Charing Cross Hill	62	Masonry
55730720	286	390.19	26	1	9 Utah Hill	55	Site Furnishings
56429737	3	261.42	13	9	6760 Parkside Park	75	Granite Surfaces
56970256	163	370.66	23	4	563 Crowley Junction	77	Ornamental Railings
59081259	81	28.55	2	4	1 Forest Dale Park	70	Exterior Signage
59863525	170	168.58	17	5	5 Briar Crest Avenue	58	Fire Sprinkler System
60136673	152	279.74	24	4	40400 Dexter Lane	63	Painting & Vinyl Wall Covering
60284048	248	345.37	1		5 Basil Alley	74	Drywall & Acoustical (MOB)
61492673	281	460.13	28	10	149 Carberry Parkway	93	Drywall & Acoustical (MOB)
61681697	279	255.24	10	5	274 Pennsylvania Crossing	55	Waterproofing & Caulking
63024166	154	171.04	6	2	84 Monica Pass	68	Structural and Misc Steel (Fabrication)
63115299	47	219.14	4	5	2 Warrior Crossing	78	Marlite Panels (FED)
63576729	132	341.53	9		261 Heffernan Street	59	Structural & Misc Steel Erection
64481660	279	476.72	10		5 Manitowish Alley	72	HVAC
65778706	27	307.40	9	10	4 Atwood Way	60	Curb & Gutter
66085161	180	182.63	6	6	854 Grim Trail	84	Drilled Shafts
66125168	251	477.08	12	3	374 Randy Crossing	93	EIFS
69025744	132	388.81	24	7	51527 Artisan Point	62	Casework
69640896	146	224.33	4	1	23892 Eagle Crest Crossing	73	Drilled Shafts
72544396	199	489.61	9	7	0 Buena Vista Drive	65	Overhead Doors
76542814	169	114.72	21	10	12761 3rd Circle	62	Epoxy Flooring
76892961	93	436.16	14		007 Nancy Avenue	87	Electrical and Fire Alarm
77512735	118	40.69	1	7	98215 Sachs Street	97	Drywall & Acoustical (MOB)
78789843	37	102.08	25	4	99117 Londonderry Street	66	Overhead Doors
78949457	29	268.58	27	8	1 Truax Road	62	Electrical
79132956	245	74.98	21	7	68404 Trailsway Court	89	Landscaping & Irrigation
80332079	272	216.81	24	2	4 Aberg Road	55	Prefabricated Aluminum Metal Canopies
80469494	119	279.33	1	8	1499 Vera Court	86	Drilled Shafts
82045408	152	407.41	19	3	5 Kenwood Place	99	Overhead Doors
82172345	273	383.39	9		6 Hayes Terrace	83	Marlite Panels (FED)
82420032	44	70.86	2	6	697 Fremont Plaza	99	Electrical
82420257	36	21.35	7	10	2413 Doe Crossing Lane	77	Retaining Wall and Brick Pavers
83076672	202	292.04	13		2 North Circle	61	Hard Tile & Stone
83868725	39	264.45	10	8	7587 Schiller Place	92	Elevator
84077482	245	33.61	24		98234 Sugar Center	92	Construction Clean and Final Clean
84361665	184	472.86	16	6	226 Lake View Crossing	91	Framing (Steel)
84387421	82	327.93	10	4	756 Kenwood Lane	89	Construction Clean and Final Clean
86140438	160	229.84	22	9	761 Michigan Place	96	Curb & Gutter
90160964	40	446.07	2	2	762 Northland Crossing	85	Retaining Wall and Brick Pavers
90573352	103	303.44	11	1	521 Briar Crest Drive	89	Asphalt Paving
90728508	169	195.80	2		06198 Roth Road	99	Overhead Doors
91366150	19	231.52	15	7	58 Riverside Court	84	Soft Flooring and Base
93312693	27	16.08	16	3	30 East Crossing	65	Epoxy Flooring
94355311	70	311.74	30	1	45 Forster Trail	68	Granite Surfaces
95236618	68	60.33	8	10	8376 Carioca Circle	68	Fire Protection
96064832	285	312.05	9		0161 Fieldstone Point	93	Rebar & Wire Mesh Install
96700998	206	72.68	14	6	78 Hollow Ridge Crossing	60	Landscaping & Irrigation
99235152	180	195.07	30		065 Anzinger Parkway	88	Drywall & Acoustical (MOB)
\.


--
-- PostgreSQL database dump complete
--

