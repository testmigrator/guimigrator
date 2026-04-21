import SwiftUI

struct Activity_start: View {
  var body: some View {
    ZStack {
      Group {
      Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .frame(height: 1.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 2.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      HStack(alignment: .center, spacing: 0) {
        Text("1 memo deleted").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("Undo").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .background(Color.clear)
        .frame(maxHeight: .infinity)
      }
      .background(Color(red: 1, green: 0.28627450980392155, blue: 0, opacity: 1))
      .frame(maxWidth: .infinity)
      .frame(height: 45.0)
      .padding(.bottom, -47.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      Group {
      HStack(alignment: .center, spacing: 0) {
        Text("Connect EverNote？").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("Connect").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .background(Color.clear)
        .frame(maxHeight: .infinity)
      }
      .background(Color(red: 0.03529411764705882, green: 0.7254901960784313, blue: 1, opacity: 1))
      .frame(maxWidth: .infinity)
      .frame(height: 45.0)
      .padding(.bottom, -47.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_start_Previews: PreviewProvider {
  static var previews: some View {
    Activity_start()
  }
}
