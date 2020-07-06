package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import musicSheetDsl.Accidental;
import musicSheetDsl.Articulation;
import musicSheetDsl.ClefType;
import musicSheetDsl.Composition;
import musicSheetDsl.Note;
import musicSheetDsl.NoteDuration;
import musicSheetDsl.NoteName;
import musicSheetDsl.Ornament;
import musicSheetDsl.Rest;
import musicSheetDsl.RestType;
import musicSheetDsl.Staff;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CompositionDsl {
  private Composition composition;
  
  public CompositionDsl(final Composition composition) {
    this.composition = composition;
  }
  
  public CharSequence compositionToXml() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE score-partwise PUBLIC \"-//Recordare//DTD MusicXML 3.1 Partwise//EN\" \"http://www.musicxml.org/dtds/partwise.dtd\">");
    _builder.newLine();
    _builder.append("<score-partwise version=\"3.1\">");
    _builder.newLine();
    _builder.append("<identification>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<rights>");
    String _tonality = this.composition.getTonality();
    _builder.append(_tonality, "\t");
    _builder.append("</rights>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<encoding><software>Flat</software>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<encoding-date>2020-07-05</encoding-date>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</encoding>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<source>https://flat.io/score/5edec32958f2c81a6494db02-twinkle-twinkle-little-star</source>");
    _builder.newLine();
    _builder.append("</identification>");
    _builder.newLine();
    _builder.append("<defaults>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<scaling>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<millimeters>7</millimeters>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tenths>40</tenths>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</scaling>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<page-layout>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<page-height>1697.142857142857</page-height>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<page-width>1200</page-width>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<page-margins type=\"both\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<left-margin>98.28571428571429</left-margin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<right-margin>98.28571428571429</right-margin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<top-margin>98.28571428571429</top-margin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<bottom-margin>98.28571428571429</bottom-margin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</page-margins>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</page-layout>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<system-layout>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<system-distance>115.2</system-distance>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</system-layout>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<staff-layout>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<staff-distance>72.57142857142857</staff-distance>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</staff-layout>");
    _builder.newLine();
    _builder.append("</defaults>");
    _builder.newLine();
    _builder.append("<credit>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<credit-type>title</credit-type>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<credit-words>");
    String _name = this.composition.getName();
    _builder.append(_name, "\t");
    _builder.append("</credit-words>");
    _builder.newLineIfNotEmpty();
    _builder.append("</credit>");
    _builder.newLine();
    _builder.append("<credit>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<credit-type>subtitle</credit-type>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<credit-words>");
    String _author = this.composition.getAuthor();
    _builder.append(_author, "\t");
    _builder.append("</credit-words>");
    _builder.newLineIfNotEmpty();
    _builder.append("</credit>");
    _builder.newLine();
    _builder.append("<part-list>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<score-part id=\"P1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<part-name>");
    String _instrument = this.composition.getInstrument();
    _builder.append(_instrument, "\t");
    _builder.append("</part-name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<part-abbreviation>Pno.</part-abbreviation>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<score-instrument id=\"P1-I1\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<instrument-name>");
    String _instrument_1 = this.composition.getInstrument();
    _builder.append(_instrument_1, "\t\t");
    _builder.append("</instrument-name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</score-instrument>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<midi-instrument id=\"P1-I1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<midi-channel>1</midi-channel>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<midi-program>1</midi-program>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<volume>100</volume>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</midi-instrument>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</score-part>");
    _builder.newLine();
    _builder.append("</part-list>");
    _builder.newLine();
    _builder.append("<part id=\"P1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<measure number=\"1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<divisions>1</divisions>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<fifths>0</fifths>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<time symbol=\"common\">");
    _builder.newLine();
    {
      EList<Staff> _staff = this.composition.getStaff();
      for(final Staff s : _staff) {
        _builder.append("\t\t");
        _builder.append("<beats>");
        int _beat = s.getTime().getBeat();
        _builder.append(_beat, "\t\t");
        _builder.append("</beats>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Staff> _staff_1 = this.composition.getStaff();
      for(final Staff s_1 : _staff_1) {
        _builder.append("\t\t");
        _builder.append("<beat-type>");
        int _beatType = s_1.getTime().getBeatType();
        _builder.append(_beatType, "\t\t");
        _builder.append("</beat-type>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</time>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<staves>2</staves>");
    _builder.newLine();
    {
      EList<Staff> _staff_2 = this.composition.getStaff();
      for(final Staff s_2 : _staff_2) {
        {
          boolean _equals = s_2.getClef().getType().equals(ClefType.VIOLIN);
          if (_equals) {
            _builder.append("\t");
            _builder.append("<clef number=\"1\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<sign>G</sign>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<line>2</line>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</clef>");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("<clef number=\"2\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<sign>F</sign>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<line>4</line>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</clef>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("<staff-details>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<staff-lines>5</staff-lines>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</staff-details>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<sound/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<sound tempo=\"");
    int _soundTempo = this.composition.getSoundTempo();
    _builder.append(_soundTempo, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<direction placement=\"above\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<direction-type>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<metronome>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<beat-unit>quarter</beat-unit>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<per-minute>");
    int _soundTempo_1 = this.composition.getSoundTempo();
    _builder.append(_soundTempo_1, "\t");
    _builder.append("</per-minute>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</metronome>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</direction-type>");
    _builder.newLine();
    {
      EList<Staff> _staff_3 = this.composition.getStaff();
      for(final Staff staff : _staff_3) {
        {
          int _number = staff.getNumber();
          boolean _equals_1 = (_number == 1);
          if (_equals_1) {
            _builder.append("<staff>1</staff>");
            _builder.newLine();
            _builder.append("</direction>");
            _builder.newLine();
            {
              EList<Staff> _staff_4 = this.composition.getStaff();
              for(final Staff s_3 : _staff_4) {
                {
                  Iterable<Rest> _filter = Iterables.<Rest>filter(s_3.getElements(), Rest.class);
                  for(final Rest rest : _filter) {
                    {
                      RestType _type = rest.getType();
                      boolean _equals_2 = Objects.equal(_type, RestType.WHOLE);
                      if (_equals_2) {
                        _builder.append("<rest/><duration>4</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_1 = rest.getType();
                      boolean _equals_3 = Objects.equal(_type_1, RestType.HALF);
                      if (_equals_3) {
                        _builder.append("<rest/><duration>2</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_2 = rest.getType();
                      boolean _equals_4 = Objects.equal(_type_2, RestType.QUARTER);
                      if (_equals_4) {
                        _builder.append("<rest/><duration>1</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_3 = rest.getType();
                      boolean _equals_5 = Objects.equal(_type_3, RestType.EIGHTH);
                      if (_equals_5) {
                        _builder.append("<rest/><duration>8</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_4 = rest.getType();
                      boolean _equals_6 = Objects.equal(_type_4, RestType.SIXTEENTH);
                      if (_equals_6) {
                        _builder.append("<rest/><duration>16</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_5 = rest.getType();
                      boolean _equals_7 = Objects.equal(_type_5, RestType.THIRTYSECOND);
                      if (_equals_7) {
                        _builder.append("<rest/><duration>32</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_6 = rest.getType();
                      boolean _equals_8 = Objects.equal(_type_6, RestType.SIXTYFOURTH);
                      if (_equals_8) {
                        _builder.append("<rest/><duration>32</duration>");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            }
            {
              EList<Staff> _staff_5 = this.composition.getStaff();
              for(final Staff s_4 : _staff_5) {
                {
                  Iterable<Note> _filter_1 = Iterables.<Note>filter(s_4.getElements(), Note.class);
                  for(final Note note : _filter_1) {
                    _builder.append("<note>");
                    _builder.newLine();
                    _builder.append("   ");
                    _builder.append("<pitch>");
                    _builder.newLine();
                    _builder.append("   ");
                    _builder.append("<step>");
                    NoteName _name_1 = note.getName();
                    _builder.append(_name_1, "   ");
                    _builder.append("</step>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("   ");
                    _builder.append("<octave>4</octave>");
                    _builder.newLine();
                    _builder.append("   ");
                    _builder.append("</pitch>");
                    _builder.newLine();
                    {
                      NoteDuration _duration = note.getDuration();
                      boolean _equals_9 = Objects.equal(_duration, NoteDuration.WHOLE);
                      if (_equals_9) {
                        _builder.append("<duration>4</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_1 = note.getDuration();
                      boolean _equals_10 = Objects.equal(_duration_1, NoteDuration.HALF);
                      if (_equals_10) {
                        _builder.append("<duration>2</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_2 = note.getDuration();
                      boolean _equals_11 = Objects.equal(_duration_2, NoteDuration.QUARTER);
                      if (_equals_11) {
                        _builder.append("<duration>1</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_3 = note.getDuration();
                      boolean _equals_12 = Objects.equal(_duration_3, NoteDuration.EIGHTH);
                      if (_equals_12) {
                        _builder.append("<duration>8</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_4 = note.getDuration();
                      boolean _equals_13 = Objects.equal(_duration_4, NoteDuration.SIXTEENTH);
                      if (_equals_13) {
                        _builder.append(" ");
                        _builder.append("<duration>16</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_5 = note.getDuration();
                      boolean _equals_14 = Objects.equal(_duration_5, NoteDuration.THIRTYSECOND);
                      if (_equals_14) {
                        _builder.append(" ");
                        _builder.append("<duration>32</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_6 = note.getDuration();
                      boolean _equals_15 = Objects.equal(_duration_6, NoteDuration.SIXTYFOURTH);
                      if (_equals_15) {
                        _builder.append(" ");
                        _builder.append("<duration>64</duration>");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t\t\t ");
                    _builder.append("<voice>1</voice>");
                    _builder.newLine();
                    _builder.append("\t\t\t ");
                    _builder.append("<type>");
                    NoteDuration _duration_7 = note.getDuration();
                    _builder.append(_duration_7, "\t\t\t ");
                    _builder.append("</type>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    _builder.append("<staff>");
                    int _number_1 = staff.getNumber();
                    _builder.append(_number_1, "\t\t\t\t");
                    _builder.append("</staff>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("<lyric number=\"1\">");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("<syllabic>begin</syllabic>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("<text>");
                    String _lyrics = note.getLyrics();
                    _builder.append(_lyrics, "\t\t\t\t");
                    _builder.append("</text> ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("</lyric>");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("<accidental>");
                    Accidental _accidental = note.getAccidental();
                    _builder.append(_accidental, "\t\t\t");
                    _builder.append("</accidental>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("<ornament>");
                    Ornament _ornament = note.getOrnament();
                    _builder.append(_ornament, "\t\t\t");
                    _builder.append("</ornament>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("<articulation>");
                    Articulation _articulation = note.getArticulation();
                    _builder.append(_articulation, "\t\t\t");
                    _builder.append("</articulation>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("<notations>");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    {
                      boolean _isFermata = note.isFermata();
                      if (_isFermata) {
                        _builder.append("<fermata/>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t\t");
                        boolean _isDot = note.isDot();
                        _builder.append(_isDot, "\t\t\t");
                        _builder.append("<dot/>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t\t\t");
                    _builder.append("</notations>");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("<dynamic>");
                    String _dynamic = note.getDynamic();
                    _builder.append(_dynamic, "\t\t\t");
                    _builder.append("</dynamic>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("</note>");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("</measure>");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("<direction placement=\"below\">");
            _builder.newLine();
            _builder.append("<direction-type>");
            _builder.newLine();
            _builder.append("<dynamics>");
            _builder.newLine();
            _builder.append("<ff/>");
            _builder.newLine();
            _builder.append("</dynamics>");
            _builder.newLine();
            _builder.append("</direction-type>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("     ");
    _builder.append("<staff>2</staff>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<sound dynamics=\"112\"/>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("</direction>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<direction placement=\"above\">");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<direction-type>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<metronome>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<beat-unit>quarter</beat-unit>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<per-minute>80</per-minute>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("</metronome>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("</direction-type>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<staff>2</staff>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("</direction>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<backup>");
    _builder.newLine();
    {
      EList<Staff> _staff_6 = this.composition.getStaff();
      for(final Staff t : _staff_6) {
        _builder.append("\t");
        _builder.append("<duration>");
        int _beat_1 = t.getTime().getBeat();
        _builder.append(_beat_1, "\t");
        _builder.append("</duration>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</backup>");
    _builder.newLine();
    {
      EList<Staff> _staff_7 = this.composition.getStaff();
      for(final Staff staff_1 : _staff_7) {
        {
          int _number_2 = staff_1.getNumber();
          boolean _equals_16 = (_number_2 == 2);
          if (_equals_16) {
            _builder.append("\t");
            _builder.append("<staff>2</staff>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</direction>");
            _builder.newLine();
            {
              EList<Staff> _staff_8 = this.composition.getStaff();
              for(final Staff s_5 : _staff_8) {
                {
                  Iterable<Rest> _filter_2 = Iterables.<Rest>filter(s_5.getElements(), Rest.class);
                  for(final Rest rest_1 : _filter_2) {
                    {
                      RestType _type_7 = rest_1.getType();
                      boolean _equals_17 = Objects.equal(_type_7, RestType.WHOLE);
                      if (_equals_17) {
                        _builder.append("<rest/><duration>4</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_8 = rest_1.getType();
                      boolean _equals_18 = Objects.equal(_type_8, RestType.HALF);
                      if (_equals_18) {
                        _builder.append("<rest/><duration>2</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_9 = rest_1.getType();
                      boolean _equals_19 = Objects.equal(_type_9, RestType.QUARTER);
                      if (_equals_19) {
                        _builder.append("<rest/><duration>1</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_10 = rest_1.getType();
                      boolean _equals_20 = Objects.equal(_type_10, RestType.EIGHTH);
                      if (_equals_20) {
                        _builder.append("<rest/><duration>8</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_11 = rest_1.getType();
                      boolean _equals_21 = Objects.equal(_type_11, RestType.SIXTEENTH);
                      if (_equals_21) {
                        _builder.append("<rest/><duration>16</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_12 = rest_1.getType();
                      boolean _equals_22 = Objects.equal(_type_12, RestType.THIRTYSECOND);
                      if (_equals_22) {
                        _builder.append("<rest/><duration>32</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      RestType _type_13 = rest_1.getType();
                      boolean _equals_23 = Objects.equal(_type_13, RestType.SIXTYFOURTH);
                      if (_equals_23) {
                        _builder.append("<rest/><duration>32</duration>");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("<measure number=\"2\">");
            _builder.newLine();
            {
              EList<Staff> _staff_9 = this.composition.getStaff();
              for(final Staff s_6 : _staff_9) {
                {
                  Iterable<Note> _filter_3 = Iterables.<Note>filter(s_6.getElements(), Note.class);
                  for(final Note note_1 : _filter_3) {
                    _builder.append("\t");
                    _builder.append("<note>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("   ");
                    _builder.append("<pitch>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("   ");
                    _builder.append("<step>");
                    NoteName _name_2 = note_1.getName();
                    _builder.append(_name_2, "\t   ");
                    _builder.append("</step>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("   ");
                    _builder.append("<octave>4</octave>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("   ");
                    _builder.append("</pitch>");
                    _builder.newLine();
                    {
                      NoteDuration _duration_8 = note_1.getDuration();
                      boolean _equals_24 = Objects.equal(_duration_8, NoteDuration.WHOLE);
                      if (_equals_24) {
                        _builder.append("<duration>4</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_9 = note_1.getDuration();
                      boolean _equals_25 = Objects.equal(_duration_9, NoteDuration.HALF);
                      if (_equals_25) {
                        _builder.append("<duration>2</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_10 = note_1.getDuration();
                      boolean _equals_26 = Objects.equal(_duration_10, NoteDuration.QUARTER);
                      if (_equals_26) {
                        _builder.append("<duration>1</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_11 = note_1.getDuration();
                      boolean _equals_27 = Objects.equal(_duration_11, NoteDuration.EIGHTH);
                      if (_equals_27) {
                        _builder.append("<duration>8</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_12 = note_1.getDuration();
                      boolean _equals_28 = Objects.equal(_duration_12, NoteDuration.SIXTEENTH);
                      if (_equals_28) {
                        _builder.append("\t");
                        _builder.append(" ");
                        _builder.append("<duration>16</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_13 = note_1.getDuration();
                      boolean _equals_29 = Objects.equal(_duration_13, NoteDuration.THIRTYSECOND);
                      if (_equals_29) {
                        _builder.append("\t");
                        _builder.append(" ");
                        _builder.append("<duration>32</duration>");
                        _builder.newLine();
                      }
                    }
                    {
                      NoteDuration _duration_14 = note_1.getDuration();
                      boolean _equals_30 = Objects.equal(_duration_14, NoteDuration.SIXTYFOURTH);
                      if (_equals_30) {
                        _builder.append("\t");
                        _builder.append(" ");
                        _builder.append("<duration>64</duration>");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t\t\t\t\t ");
                    _builder.append("<voice>1</voice>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t ");
                    _builder.append("<type>");
                    NoteDuration _duration_15 = note_1.getDuration();
                    _builder.append(_duration_15, "\t\t\t\t\t ");
                    _builder.append("</type>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t\t\t");
                    _builder.append("<staff>2</staff>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<lyric number=\"1\">");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t\t");
                    _builder.append("<syllabic>begin</syllabic>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t\t");
                    _builder.append("<text>");
                    String _lyrics_1 = note_1.getLyrics();
                    _builder.append(_lyrics_1, "\t\t\t\t\t\t");
                    _builder.append("</text> ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("</lyric>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<accidental>");
                    Accidental _accidental_1 = note_1.getAccidental();
                    _builder.append(_accidental_1, "\t\t\t\t\t");
                    _builder.append("</accidental>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<ornament>");
                    Ornament _ornament_1 = note_1.getOrnament();
                    _builder.append(_ornament_1, "\t\t\t\t\t");
                    _builder.append("</ornament>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<articulation>");
                    Articulation _articulation_1 = note_1.getArticulation();
                    _builder.append(_articulation_1, "\t\t\t\t\t");
                    _builder.append("</articulation>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<notations>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t");
                    {
                      boolean _isFermata_1 = note_1.isFermata();
                      if (_isFermata_1) {
                        _builder.append("<fermata/>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t\t\t\t");
                        boolean _isDot_1 = note_1.isDot();
                        _builder.append(_isDot_1, "\t\t\t\t\t");
                        _builder.append("<dot/>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t\t\t\t\t");
                    _builder.append("</notations>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<dynamic>");
                    String _dynamic_1 = note_1.getDynamic();
                    _builder.append(_dynamic_1, "\t\t\t\t\t");
                    _builder.append("</dynamic>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    _builder.append("</note>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("</measure>");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("<barline location=\"right\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<bar-style>light-heavy</bar-style>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<repeat winged=\"none\" times=\"1\" direction=\"backward\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</barline>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</measure>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</part>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</score-partwise>");
    _builder.newLine();
    return _builder;
  }
}
