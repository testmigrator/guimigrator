import SwiftUI

struct Teach_name: View {
  var body: some View {
    ZStack {
      Text("My name is......").font(.system(size: 26)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("Press the button below to listen").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 39.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("सुनने के लिए नीचे दिए गए बटन दबाएं").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 56.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_button")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.top, 17.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Image("girl_transparent").background(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
      Text("Tap the mic to repeat ...").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_mic")
      }
      .background(Color.clear)
      .frame(height: 230.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
      Text("दोहराने के लिए माइक टैप करें ...").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.bottom, 230.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Teach_name_Previews: PreviewProvider {
  static var previews: some View {
    Teach_name()
  }
}
