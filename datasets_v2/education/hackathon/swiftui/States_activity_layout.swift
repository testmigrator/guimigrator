import SwiftUI

struct States_activity_layout: View {
  var body: some View {
    ZStack {
      Group {
      Picker("", selection: .constant(0)) {
        Text("Choose State").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      .padding(.top, 15.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("Sample Output Text").font(.system(size: 26)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Group {
      VStack(alignment: .center, spacing: 0) {
      }
      .padding(.bottom, 60.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_mic")
      }
      .background(Color.clear)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
      Text("Tap on mic to speak").font(.system(size: 15)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 15.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Image("girl_transparent").frame(maxWidth: .infinity, alignment: .leading)
      Text("Choose the name of the state from the list").font(.system(size: 15)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 49.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("OR").font(.system(size: 15)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 64.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct States_activity_layout_Previews: PreviewProvider {
  static var previews: some View {
    States_activity_layout()
  }
}
