import SwiftUI

struct Act_hints: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Text("\"Host Shortcuts\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        Text("\"Long-press on your Android desktop to create direct shortcuts to frequently-used SSH hosts.\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 5.0).padding(.bottom, 5.0)
        Text("\"Scroll back / Scroll forward\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        Text("\"Swiping your finger up on the right side of the screen allows you to scroll backward and forward in the local terminal buffer history.\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 5.0).padding(.bottom, 5.0)
        Image("gesture_scrollback").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("\"Scrolling back\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 5.0)
        Image("gesture_scrollforward").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("\"Scrolling forward\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 5.0)
        Text("\"Page Up / Page Down\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        Text("\"NOTE: This must be enabled in settings.\"nn\"Swiping your finger up and down on the left third of the screen	will send a page up and page down key to the remote host. Many programs	map this to scrolling back into history such as irssi or tinyfugue.\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 5.0).padding(.bottom, 5.0)
        Image("gesture_pgup").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("\"Page up\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 5.0)
        Image("gesture_pgdn").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("\"Page down\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 5.0)
        Text("\"Switching Hosts\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        Text("\"Swiping your finger from one side of the screen to the other will switch between currently connected hosts.\"").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 5.0).padding(.bottom, 5.0)
        Image("gesture_hostprev").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("\"Previous host\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 5.0)
        Image("gesture_hostnext").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("\"Next host\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 5.0)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Act_hints_Previews: PreviewProvider {
  static var previews: some View {
    Act_hints()
  }
}
