package org.xtext.example.mydsl.generator

import musicSheetDsl.ClefType
import musicSheetDsl.Composition
import musicSheetDsl.Note
import musicSheetDsl.NoteDuration
import musicSheetDsl.Rest
import musicSheetDsl.RestType

class CompositionDsl {
	Composition composition;
	
	new (Composition composition) {
		this.composition = composition;
	}
	def compositionToXml() '''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	<!DOCTYPE score-partwise PUBLIC "-//Recordare//DTD MusicXML 3.1 Partwise//EN" "http://www.musicxml.org/dtds/partwise.dtd">
	<score-partwise version="3.1">
	<identification>
		<rights>«composition.tonality»</rights>
		<encoding><software>Flat</software>
		<encoding-date>2020-07-05</encoding-date>
		</encoding>
		<source>https://flat.io/score/5edec32958f2c81a6494db02-twinkle-twinkle-little-star</source>
	</identification>
	<defaults>
		<scaling>
			<millimeters>7</millimeters>
			<tenths>40</tenths>
		</scaling>
		<page-layout>
			<page-height>1697.142857142857</page-height>
			<page-width>1200</page-width>
			<page-margins type="both">
				<left-margin>98.28571428571429</left-margin>
				<right-margin>98.28571428571429</right-margin>
				<top-margin>98.28571428571429</top-margin>
				<bottom-margin>98.28571428571429</bottom-margin>
			</page-margins>
		</page-layout>
		<system-layout>
			<system-distance>115.2</system-distance>
		</system-layout>
		<staff-layout>
			<staff-distance>72.57142857142857</staff-distance>
		</staff-layout>
	</defaults>
	<credit>
		<credit-type>title</credit-type>
		<credit-words>«composition.name»</credit-words>
	</credit>
	<credit>
		<credit-type>subtitle</credit-type>
		<credit-words>«composition.author»</credit-words>
	</credit>
	<part-list>
		<score-part id="P1">
		<part-name>«composition.instrument»</part-name>
		<part-abbreviation>Pno.</part-abbreviation>
		<score-instrument id="P1-I1">
			<instrument-name>«composition.instrument»</instrument-name>
		</score-instrument>
		<midi-instrument id="P1-I1">
		<midi-channel>1</midi-channel>
		<midi-program>1</midi-program>
		<volume>100</volume>
		</midi-instrument>
		</score-part>
	</part-list>
	<part id="P1">
		<measure number="1">
		<attributes>
		<divisions>1</divisions>
		<key>
			<fifths>0</fifths>
		</key>
		<time symbol="common">
			«FOR s: composition.staff»
			<beats>«s.getTime().getBeat()»</beats>
			«ENDFOR»
			«FOR s: composition.staff»
			<beat-type>«s.getTime().getBeatType()»</beat-type>
			«ENDFOR»
		</time>
		<staves>2</staves>
		«FOR s: composition.staff»
		«IF s.getClef().getType().equals(ClefType.VIOLIN)»
		<clef number="1">
		<sign>G</sign>
		<line>2</line>
		</clef>
		«ELSE»
		<clef number="2">
		<sign>F</sign>
		<line>4</line>
		</clef>
		«ENDIF»
	    «ENDFOR»
		<staff-details>
		<staff-lines>5</staff-lines>
		</staff-details>
		</attributes>
		<sound/>
		<sound tempo="«composition.soundTempo»"/>
		<direction placement="above">
		<direction-type>
		<metronome>
		<beat-unit>quarter</beat-unit>
		<per-minute>«composition.soundTempo»</per-minute>
		</metronome>
		</direction-type>
«FOR staff: composition.staff»
«IF staff.number == 1»
		<staff>1</staff>
		</direction>
		«FOR s: composition.staff»
	    «FOR rest: s.elements.filter(Rest)»
	    «IF rest.type == RestType.WHOLE»
		<rest/><duration>4</duration>
		 «ENDIF»
		 «IF rest.type == RestType.HALF»
		 <rest/><duration>2</duration>
		 «ENDIF»
		 «IF rest.type == RestType.QUARTER»
		 <rest/><duration>1</duration>
		 «ENDIF»
		 «IF rest.type == RestType.EIGHTH»
		 <rest/><duration>8</duration>
		 «ENDIF»
		 «IF rest.type == RestType.SIXTEENTH»
		 <rest/><duration>16</duration>
		 «ENDIF»
		 «IF rest.type == RestType.THIRTYSECOND»
		 <rest/><duration>32</duration>
		 «ENDIF»
		 «IF rest.type == RestType.SIXTYFOURTH»
		  <rest/><duration>32</duration>
		 «ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR s: composition.staff»
		«FOR note:s.elements.filter(Note)»
		 <note>
		    <pitch>
		    <step>«note.name»</step>
		    <octave>4</octave>
		    </pitch>
	      «IF note.duration == NoteDuration.WHOLE»
		     <duration>4</duration>
		  «ENDIF»
		  «IF note.duration == NoteDuration.HALF»
			<duration>2</duration>
		  «ENDIF»
		  «IF note.duration == NoteDuration.QUARTER»
			<duration>1</duration>
		  «ENDIF»
		  «IF note.duration == NoteDuration.EIGHTH»
			<duration>8</duration>
		  «ENDIF»
		  «IF note.duration == NoteDuration.SIXTEENTH»
		     <duration>16</duration>
		  «ENDIF»
		  «IF note.duration == NoteDuration.THIRTYSECOND»
		     <duration>32</duration>
		  «ENDIF»
		  «IF note.duration == NoteDuration.SIXTYFOURTH»
		     <duration>64</duration>
		  «ENDIF»		     	     
			 <voice>1</voice>
			 <type>«note.duration»</type>
				<staff>«staff.number»</staff>
			<lyric number="1">
				<syllabic>begin</syllabic>
				<text>«note.lyrics»</text> 
			</lyric>
			<accidental>«note.accidental»</accidental>
			<ornament>«note.ornament»</ornament>
			<articulation>«note.articulation»</articulation>
			<notations>
			«IF note.fermata»<fermata/>
			«ELSE»
			«note.dot»<dot/>
			«ENDIF»
			</notations>
			<dynamic>«note.dynamic»</dynamic>
		</note>
		</measure>
		«ENDFOR»
		«ENDFOR»
		<direction placement="below">
		<direction-type>
		<dynamics>
		<ff/>
		</dynamics>
		</direction-type>
	     «ENDIF»
	     «ENDFOR»
	     <staff>2</staff>
	     <sound dynamics="112"/>
	     </direction>
	     <direction placement="above">
	     <direction-type>
	     <metronome>
	     <beat-unit>quarter</beat-unit>
	     <per-minute>80</per-minute>
	     </metronome>
	     </direction-type>
	     <staff>2</staff>
	     </direction>
		<backup>
		«FOR t: composition.staff»
		<duration>«t.getTime().getBeat()»</duration>
		«ENDFOR»
		</backup>
		«FOR staff: composition.staff»
		«IF staff.number == 2»
				<staff>2</staff>
				</direction>
				«FOR s: composition.staff»
					    «FOR rest: s.elements.filter(Rest)»
					    «IF rest.type == RestType.WHOLE»
						<rest/><duration>4</duration>
						 «ENDIF»
						 «IF rest.type == RestType.HALF»
						 <rest/><duration>2</duration>
						 «ENDIF»
						 «IF rest.type == RestType.QUARTER»
						 <rest/><duration>1</duration>
						 «ENDIF»
						 «IF rest.type == RestType.EIGHTH»
						 <rest/><duration>8</duration>
						 «ENDIF»
						 «IF rest.type == RestType.SIXTEENTH»
						 <rest/><duration>16</duration>
						 «ENDIF»
						 «IF rest.type == RestType.THIRTYSECOND»
						 <rest/><duration>32</duration>
						 «ENDIF»
						 «IF rest.type == RestType.SIXTYFOURTH»
						  <rest/><duration>32</duration>
						 «ENDIF»
						«ENDFOR»
						«ENDFOR»
				<measure number="2">
				«FOR s: composition.staff»
				«FOR note:s.elements.filter(Note)»
				 <note>
				    <pitch>
				    <step>«note.name»</step>
				    <octave>4</octave>
				    </pitch>
			      «IF note.duration == NoteDuration.WHOLE»
				     <duration>4</duration>
				  «ENDIF»
				  «IF note.duration == NoteDuration.HALF»
					<duration>2</duration>
				  «ENDIF»
				  «IF note.duration == NoteDuration.QUARTER»
					<duration>1</duration>
				  «ENDIF»
				  «IF note.duration == NoteDuration.EIGHTH»
					<duration>8</duration>
				  «ENDIF»
				  «IF note.duration == NoteDuration.SIXTEENTH»
				     <duration>16</duration>
				  «ENDIF»
				  «IF note.duration == NoteDuration.THIRTYSECOND»
				     <duration>32</duration>
				  «ENDIF»
				  «IF note.duration == NoteDuration.SIXTYFOURTH»
				     <duration>64</duration>
				  «ENDIF»		     	     
					 <voice>1</voice>
					 <type>«note.duration»</type>
						<staff>2</staff>
					<lyric number="1">
						<syllabic>begin</syllabic>
						<text>«note.lyrics»</text> 
					</lyric>
					<accidental>«note.accidental»</accidental>
					<ornament>«note.ornament»</ornament>
					<articulation>«note.articulation»</articulation>
					<notations>
					«IF note.fermata»<fermata/>
					«ELSE»
					«note.dot»<dot/>
					«ENDIF»
					</notations>
					<dynamic>«note.dynamic»</dynamic>
				</note>
				</measure>
		«ENDFOR»
	    «ENDFOR»
	    «ENDIF»
	    «ENDFOR» 
		<barline location="right">
		<bar-style>light-heavy</bar-style>
		<repeat winged="none" times="1" direction="backward"/>
		</barline>
		</measure>
		</part>
		</score-partwise>
		'''
		}